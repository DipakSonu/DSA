class CircularLinkedList{

    static class Node{
        
        int data;
        Node next;
    }
    Node addToEmpthy(Node last, int data){

        if(last!=null){
            return last;
        }
        else{
            Node new_node = new Node();
            new_node.data=data;
            last=new_node;
            last.next=last;
            return last;
        }
    }
    
    static void traverse(Node last){
        
        Node tnode;

        if (last==null){       
            System.out.println("List is empty.");       
            return;         
        } 
        tnode=last.next;
        System.out.println("\n\n last-->>"+last);
        System.out.println("\n\n ");
        do{
            
            System.out.print(" "+tnode.data+"-->"+tnode.next);
            tnode=tnode.next;
                
        }
        while(tnode!=last.next);
        System.out.println("\n\n ");
    }

    Node addBegin(Node last,int data){
        
        if(last==null){
            last=addToEmpthy(last, data);
            return last;
        }
        else{
            
            Node new_node=new Node();
            
            new_node.data=data;
            
            new_node.next=last.next;

            last.next=new_node;
  
        }
        return last;
    }
}
class InsertionAtBeginning{

    public static void main(String[] args) {
        
        CircularLinkedList list = new CircularLinkedList();
        
        CircularLinkedList.Node last=null;

        //last = list.addToEmpthy(last, 7);

        last=list.addBegin(last, 7);
        last=list.addBegin(last, 17);
        last=list.addBegin(last, 27);
       //last=list.addBegin(last,37);
        CircularLinkedList.traverse(last);
    }
}
 
