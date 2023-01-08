class CircularLinkedList{

    static class Node{

        int data;
        Node next;
    }
    
    static Node addToEmpthy(Node last, int data){
        
        if(last!=null){
            return last;
        }
        else{
            
            Node new_node = new Node();
            new_node.data=data;
            System.out.println("\n\t new_node "+new_node+" new_node.data "+new_node.data);
            last=new_node;
            new_node.next=new_node;

        }
        return last;
    }

    static Node addBegin(Node last, int data){

        if(last==null){
            return addToEmpthy(last, data);
        }
        else{
            Node new_node=new Node();
            new_node.data=data;
            System.out.println("\n\t new_node "+new_node+" new_node.data "+new_node.data);
            new_node.next=last.next;
            last.next=new_node;
            return last;
        }
    }

    static Node addAfter(Node last,int data, int item){

        if(last==null){
            return addToEmpthy(last, data);
        }
        else{

            Node new_node;
            Node tnode;
            tnode=last.next;
            
            do{
                System.out.println("\n\t last.next "+tnode+" data "+tnode.data);
                if(tnode.data==item){
                    new_node = new Node();
                    new_node.data=data;
                    System.out.println("\n\t new_node "+new_node+" new_node.data "+new_node.data+" new_node.next "+new_node.next);
                    System.out.println("\n\t tnode.next "+tnode.next);
                    new_node.next=tnode.next;
                    System.out.println("\n\t new_node.next : "+new_node.next);
                    tnode.next=new_node;

                    if(tnode==last){
                        last=new_node;
                    }
                    return last;
                }
                tnode=tnode.next;
            }
            while(tnode!=last.next);
            
            System.out.println(" "+item+" not present in the list");
            return last;
        }
        
    }
    
    static void displayList(Node last){

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

class InsertionBetweenNodes{

    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;

        last=CircularLinkedList.addBegin(last, 10);
        
        last=CircularLinkedList.addBegin(last, 8);

        last=CircularLinkedList.addBegin(last, 6);
        
        //last=CircularLinkedList.addBegin(last, 2);

        CircularLinkedList.displayList(last);

        last=CircularLinkedList.addAfter(last, 44,10);

        CircularLinkedList.displayList(last);
    }
}