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

    public void push(int data){

        Node new_node=new Node(data);
        
        new_node.next=head;

        if(head!=null){
            head.prev=new_node;
        }
        else if(head==null){
            new_node.prev=null;
        }
        head=new_node;
        
    }

    void displayList(Node node){

        Node tnode=null;
        System.out.println("\n\n head "+head);
        System.out.println("\n\n ");
        while(node!=null){
            System.out.print(node.prev+"-->>"+node.data+"-->>"+node.next+"-->>");
            tnode=node;
            node=node.next;
        }
        System.out.println("\n\n");
    }

    void printList(Node head){
        Node tnode=head;
        System.out.println("\n\n head "+head);
        System.out.println("\n\n ");

        while(tnode!=null){
            System.out.print(/*tnode.prev+"-->>"+*/" "+tnode.data/*+"-->>"+tnode.next+"-->>"*/);
            tnode=tnode.next;
        }
        System.out.println("\n\n");
    }
}
class AddNodeAtFront{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        //DoublyLinkedList.Node node=null;

        list.push(10);

        list.push(20);

        list.push(30);

        list.push(40);

        //list.displayList(list.head);

        list.printList(list.head);
    }
}