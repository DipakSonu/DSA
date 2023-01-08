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
    
    Node addToEmpthy(int data){

        Node new_node = new Node(data);
        
        last=new_node;

        last.next=new_node;
        
        return last;
    }

    void displayList(){

        Node tNode=last.next;
        System.out.println("\n\n ");

        do{ 
            
            System.out.print(" "+tNode.data);
            tNode=tNode.next;
           
        }
        while(tNode!=last.next);
        System.out.println("\n\n ");
    }

    Node addToBegin(Node last,int data){
        
        if(last==null){
           return addToEmpthy(data);
        }
        else{
            Node new_node=new Node(data);

            new_node.next=last.next;

            last.next=new_node;

            return last;
        }
    }
}

class InsertAtBeginningDipak{

    public static void main(String[] args) {
        
        CircularLinkedList list = new CircularLinkedList();
        
        CircularLinkedList.Node last=null;

        last=list.addToBegin(last,7);

        last=list.addToBegin(last,17);

        last=list.addToBegin(last,27);

        list.displayList();
    }
}