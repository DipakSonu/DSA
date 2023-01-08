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

    void displayList(Node last){

        Node tNode=last.next;
        System.out.println("\n\n  "/*+last*/);

        do{ 
            System.out.print(" "+tNode.data/*+"-->"+tNode.next*/);
            tNode=tNode.next;
           
        }
        while(tNode!=last.next);
        System.out.println("\n\n ");
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
    
    Node addAfter(Node last, int data, int item){
        
        if(last==null){
            return addToEmpthy(last, data);
        }
        else{
            Node new_node;
            Node tNode;
            tNode=last.next;

            do {
                if(tNode.data==item){
                    new_node = new Node(data);
                    new_node.next=tNode.next;
                    tNode.next=new_node;

                    if(tNode==last){
                        last=new_node;
                    }
                }
                tNode=tNode.next;
            } 
            while (tNode!=last.next);
            System.out.println("\n\t Item is not prsent in list");
        }

        return last;
    }
}
class InsertBetweenNodesDipak{

    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;
        
        CircularLinkedList list = new CircularLinkedList();

        last=list.addToEnd(last, 5);
        last=list.addToEnd(last, 6);
        last=list.addToEnd(last, 7);
        last=list.addToEnd(last, 8);

        list.displayList(last);

        last=list.addAfter(last, 44, 18);

        list.displayList(last);
    }
}