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

            Node new_node=new Node(data);
            
            last=new_node;

            new_node.next=last;
            
        }

        return last;
    }

    Node addToEnd(Node last, int data){
        
        if(last==null){
            return addToEmpthy(last, data);
        }
        else{
            Node new_node = new Node(data);
            new_node.next=last.next;
            last.next=new_node;
            last=new_node;
        }

        return last;
    }

    Node deleteBeginning(Node last){
        
        Node tnode=last.next;
        Node head=last.next;
 
        do{

            last.next=tnode.next;
            tnode=tnode.next;
            head.next=null;
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
class DeleteFromBeginning{
    
    public static void main(String[] args) {

        CircularLinkedList.Node last = null;
        
        CircularLinkedList list = new CircularLinkedList();

        last=list.addToEnd(last, 10);

        last=list.addToEnd(last, 20);

        last=list.addToEnd(last, 30);

        last=list.addToEnd(last, 40);

        last=list.addToEnd(last, 50);       

        list.displayList(last);
        
        last=list.deleteBeginning(last);

        list.displayList(last);

        last=list.deleteBeginning(last);

        list.displayList(last);

        last=list.deleteBeginning(last);

        list.displayList(last);

        last=list.deleteBeginning(last);

        list.displayList(last);

    }
}

/*
 *  /*for(int i=0; i<1; i++){
    
            last.next=tnode.next;
            head.next=null;
        }
 */