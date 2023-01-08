class CircularLinkedList{
    
    static class Node{

        int data;
        Node next;
    };

    static Node addToEmpthy(Node last,int data){
        
        if(last!=null){
            return last;
        }
        else{
            Node new_node = new Node();
            new_node.data=data;
            last=new_node;
            last.next = last;
            return last;
        }

    }

    static void traverse(Node last){

        Node p;

        if(last==null){
            System.out.println("List is empty");
            return;
        }
        else{
                p=last.next; 
                System.out.println("\n\n last-->>"+last);
                System.out.println("\n\n ");
                do{

                    System.out.print(" "+p.data+"-->"+p.next);
                    p=p.next;
                }
                while(p!=last.next);
                System.out.println("\n\n ");
        }
    }

}
class InsertAtEmpthyList{
    
    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;
        
        last=CircularLinkedList.addToEmpthy(last, 7);

        CircularLinkedList.traverse(last);

        //System.out.println(" ");
    }
}