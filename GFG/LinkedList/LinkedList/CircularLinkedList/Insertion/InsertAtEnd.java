class CircularLinkedList{

    static class Node{

        int data;
        Node next;
    }

    Node addToEmpty(Node last, int data){
        
        if(last!=null){
            return last;
        }
        else{
            Node new_node=new Node();
            System.out.println("\n\t new_node :"+new_node+" ,new_node.data :"+new_node.data+" ,new_node.next "+new_node.next);
            new_node.data=data;
            last=new_node;
            last.next=new_node;
        }
        return last;
    }

    Node addEnd(Node last, int data){

        if(last==null){
            return addToEmpty(last, data);
        }
        else{
            Node new_node=new Node();
            new_node.data=data;
            System.out.println("\n\t new_node :"+new_node+" ,new_node.data :"+new_node.data+" ,new_node.next "+new_node.next);  
            new_node.next=last.next;
            last.next=new_node;
            last=new_node;
        }
        
        return last;
    }
    void displayList(Node last){

        Node tNode=last.next;
        System.out.println("\n\n last "+last);
        System.out.println("\n\n ");
        do{ 
            System.out.print(" "+tNode.data+"-->"+tNode.next);
            tNode=tNode.next;
        
        }
        while(tNode!=last.next);
        System.out.println("\n\n ");
    }

    
}
class InsertAtEnd{

    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;
        CircularLinkedList list=new CircularLinkedList();

        last=list.addToEmpty(last, 10);

        list.displayList(last);        

        last=list.addEnd(last, 110);

        list.displayList(last);

        last=list.addEnd(last, 1110);
        
        list.displayList(last);

        //CircularLinkedList.traverse(last);
    }
}