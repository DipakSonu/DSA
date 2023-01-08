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

    void printList(Node head){

        Node tnode=head;
        System.out.println("\n\n head "+head);
        System.out.println("\n\n ");
        while(tnode!=null){
            System.out.print(/*tnode.prev+"-->>"+*/tnode.data/*+"-->>"+tnode.next+"-->>"*/+" ");
            tnode=tnode.next;
        }
        System.out.println("\n\n ");
    }

    void push(int data){

        Node new_node = new Node(data);
        
        new_node.next=head;

        if(head!=null){
            new_node.prev=new_node;
        }
        else{
            new_node.prev=null;
        }
        head=new_node;
    }

    void append(int data){
        
        if(head==null){
            push(data);
        }
        else{

           // System.out.println("\n\n Inside else block "+data);
            Node tnode=head; 

            Node new_node = new Node(data);

            new_node.next=null;

            while(tnode.next!=null){
                
                tnode=tnode.next;
                    
            }
            tnode.next=new_node;

            new_node.prev=tnode;
            
        }
    }

}
class AddNodeAtEnd {

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        list.printList(list.head);
    }
}