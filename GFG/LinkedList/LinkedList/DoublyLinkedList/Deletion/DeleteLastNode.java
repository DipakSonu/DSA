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
        //System.out.println("\n\n new_node.data "+data+" new_node "+new_node);
        Node temp=head;
        if(head==null){

            new_node.prev=head;
            new_node.next=null;
            head=new_node;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            new_node.prev=temp;
            new_node.next=null;
            temp.next=new_node;
        }
    }

    void deleteEnd(){

        Node last=head;
        
        //System.out.println("\n\n last "+last);
        while(last.next!=null){
            last=last.next;
        }
        //System.out.println("\n\n last : "+last);
        
        last.prev.next=null;

        last.prev=null;
        
    }

    void displayList(Node head){

        Node tnode=head;
        Node last=null;

        while(tnode!=null){
            last=tnode;
            System.out.print(" "+tnode.data);
            tnode=tnode.next;
        }
        System.out.println("\n\n ");

        while(last!=null){
            System.out.print(" "+last.data);
            last=last.prev;
        }
        System.out.println("\n\n ");
    }
}
class DeleteLastNode{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(7);
        list.append(14);
        list.append(21);
        list.append(28);
        list.append(35);

        list.displayList(list.head);

        list.deleteEnd();

        list.displayList(list.head);

        list.deleteEnd();

        list.displayList(list.head);

        list.deleteEnd();

        list.displayList(list.head);

        list.deleteEnd();

        list.displayList(list.head);
    }
}