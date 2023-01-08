class LinkedList{

    Node head;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addToEmpthy(int data ){
        
        Node new_node = new Node(data);
        head=new_node;
        System.out.println("\n\t Head-->> "+head);
        new_node.next=head;
        System.out.println("\n\t new_node.next-->> "+new_node.next);
    }

    void displayList(){

        Node tNode=head.next;

        do{
            System.out.println(" "+tNode.data);
            tNode=tNode.next;
        }
        while(tNode!=head.next);
    }
}
class InsertAtEmpthyListDipak{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.addToEmpthy(7);

        list.displayList();
    }

}