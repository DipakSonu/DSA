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
        }
        return last;
    }

    Node addToFront(Node last,int data){

        if(last==null){
            return addToEmpthy(last,data);
        }
        else{

            Node new_node = new Node(data);

            new_node.next=last.next;

            last.next=new_node;

            return last;
        }
    }

    Node addToFrontSinglyList(Node head,int data){
         
        Node new_node=new Node(data);
        
        new_node.next=head;

        head=new_node;

        return head;
    }

    boolean isCircular(Node head){
	    // Your code here
        if(head==null){
            return true;
        }
        Node tnode=head.next;
        
        try {

            while(tnode!=head){
                
                if(tnode==null){
                    return false;
                }
                tnode=tnode.next;
                System.out.println("\n\t tnode-->>"+tnode);
            }
       } 
        catch (NullPointerException npe) {
            npe.printStackTrace();
        }
        return true;    
    }

    void displaySingularList(Node head){
        
        Node tnode=head;
        
        System.out.println("\n\n head "+head);
        System.out.println("\n\n");
        while(tnode!=null){
            System.out.print(" "+tnode.data+"-->>"+tnode.next);
            tnode=tnode.next;
        }
        System.out.println("\n\n ");
    }

   void displayList(Node last){

        Node tnode = last.next;
        System.out.println("\n\n last "+last);
        System.out.println("\n\n ");
        
        do {
            System.out.print(" "+tnode.data+"-->"+tnode.next);
            tnode=tnode.next;
        } 
        while(tnode!=last.next);
        System.out.println("\n\n ");
    }
}
class IsCircularList{

    public static void main(String[] args) {
        
        CircularLinkedList list = new CircularLinkedList();

        /*CircularLinkedList.Node last=null;
        
        last=list.addToFront(last, 10);

        last=list.addToFront(last, 20);

        last=list.addToFront(last, 30);

        last=list.addToFront(last, 40);

        list.displayList(last);
        
        System.out.println("\n\t Response "+list.isCircular(last.next));*/

        //System.out.println(" last.next(head)>>>>"+last.next);

       CircularLinkedList.Node head=null;

       head=list.addToFrontSinglyList(head, 91);

       //head=list.addToFrontSinglyList(head, 20);

       /*head=list.addToFrontSinglyList(head, 30);

       head=list.addToFrontSinglyList(head, 40);

       list.displaySingularList(head);*/
       
       boolean res = list.isCircular(head)? true: false;
       System.out.println("\n\t Response "+res);
        
    }
}

