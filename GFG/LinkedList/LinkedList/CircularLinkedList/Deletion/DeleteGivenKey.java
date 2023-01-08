class CircularLinkedList{

    Node last;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node addToEmpthy(Node last, int data){
        
        if(last!=null){
            return last;
        }
        else{
            Node new_node = new Node(data);

            last=new_node;

            new_node.next=last;

            return last;
        }
    }

    Node addToEnd(Node last,int data){

        if(last==null){
            return addToEmpthy(last, data);
        }
        else{
            
            Node new_node=new Node(data);
            
            new_node.next=last.next;

            last.next=new_node;

            last=new_node;

            return last;
        }
    }

    Node deleteNode(Node last,int key){

        Node tnode=last.next;
        Node head=last;
 
        do {

            if(tnode.data==key){

                head.next=tnode.next;

                if(tnode==last){
                    last=head;
                }
            }
            
            tnode=tnode.next;
            head=head.next;
        } 
        while(tnode!=last.next);

        return last;
    }

    void displayList(Node last){

        Node tNode=last.next;
        System.out.println("\n\n last "+last);
        System.out.println("\n\n ");
        do{ 
            System.out.print(" "+tNode.data+"-->>"+tNode.next);
            tNode=tNode.next;
           
        }
        while(tNode!=last.next);
        System.out.println("\n\n ");
    }

}
class DeleteGivenKey {

    public static void main(String[] args) {
         
        CircularLinkedList.Node last=null;

        CircularLinkedList list = new CircularLinkedList();

        last=list.addToEnd(last, 5);

        last=list.addToEnd(last, 10);

        last=list.addToEnd(last, 15);

        last=list.addToEnd(last, 20);

        list.displayList(last);

        last=list.deleteNode(last, 5);

        list.displayList(last);
    }
}