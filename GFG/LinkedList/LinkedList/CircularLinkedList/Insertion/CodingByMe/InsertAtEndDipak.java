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

    Node addToEnd(Node last, int data){

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
    void displayList(Node last){

        Node tNode=last.next;
        System.out.println("\n\n last "+last);

        do{ 
            System.out.print(" "+tNode.data+"-->"+tNode.next);
            tNode=tNode.next;
           
        }
        while(tNode!=last.next);
        System.out.println("\n\n ");
    }

    
}
class InsertAtEndDipak{

    public static void main(String[] args) {
        
        CircularLinkedList list = new CircularLinkedList();
        
        CircularLinkedList.Node last=null;
        
        last=list.addToEnd(last, 8);
        last=list.addToEnd(last, 18);
        last=list.addToEnd(last, 28);
        last=list.addToEnd(last, 38);

        list.displayList(last);

    }
}