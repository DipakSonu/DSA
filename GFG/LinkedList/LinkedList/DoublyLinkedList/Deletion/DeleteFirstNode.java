class  DoublyLinkedList{

    Node head;

    class Node{

        Node next;
        Node prev;
        int data;

        Node(int data){

            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    void append(int data){

        Node new_node = new Node(data);
        Node tnode=head;

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

    void deletebegin(){

        Node tnode=head;

        tnode=tnode.next;

        tnode.prev=null;

        head=tnode;
    }

    void displayList(Node head){
            
            Node tnode=head;
            Node last=null;

            while(tnode!=null){
                last=tnode;
                System.out.print(" "+tnode.data);
                tnode=tnode.next;
            }
            System.out.print("\n\n ");

            while(last!=null){
                System.out.print(" "+last.data);
                last=last.prev;
            }
            System.out.print("\n\n ");
    }
}
class DeleteFirstNode{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        list.displayList(list.head);

        list.deletebegin();

        list.displayList(list.head);

        list.deletebegin();

        list.displayList(list.head);

        list.deletebegin();

        list.displayList(list.head);

    }
}