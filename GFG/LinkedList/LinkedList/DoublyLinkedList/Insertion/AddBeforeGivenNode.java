class DoublyLinkedList{

    Node head;

    class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    void append(int data){

        Node new_node = new Node(data);
        Node tnode=head;
        //System.out.println("\n\n data "+data+" new_node "+new_node);
        if(head==null){
            new_node.prev=null;
            new_node.next=head;
            head=new_node;
        }
        else{
            while(tnode.next!=null){
                tnode=tnode.next;
            }
            new_node.prev=tnode;
            new_node.next=null;
            tnode.next=new_node;
        }
    }

    void displayList(Node head){

        Node tNode=head;
        Node last=null;

        while(tNode!=null){
            System.out.print(" "+tNode.data);
            last=tNode;
            tNode=tNode.next;
        }
        System.out.println("\n\n ");

        while(last!=null){
            System.out.print(" "+last.data);
            last=last.prev;
        }
        System.out.println("\n\n ");
    }

    void insertBefore(Node next_node, int data){
        
        Node tnode=head;
        Node new_node=new Node(data);
        //System.out.println("\n\n data "+data+" new_node "+new_node);

        if(tnode!=next_node){

            while(tnode!=next_node){
                tnode=tnode.next;
            }
            //System.out.println("\n\t Inside first if block"+tnode+" next.node "+next_node);
        }
        if(tnode==next_node){
            
            //System.out.println("\n\t tnode.prev "+tnode.prev);

            new_node.prev=tnode.prev;

            new_node.next=tnode;
            
            tnode.prev=new_node;

            if(new_node.prev!=null){
                new_node.prev.next=new_node;
            }
            else{
                head=new_node;
            }
            
        }
    }
}
class AddBeforeGivenNode{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        
        list.displayList(list.head);

        list.insertBefore(list.head.next, 100);

        list.displayList(list.head);


    }
}