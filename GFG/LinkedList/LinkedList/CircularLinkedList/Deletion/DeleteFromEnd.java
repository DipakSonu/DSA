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

    Node addToEmpthy(Node last, int data){
        
        if(last!=null){
            return last;
        }
        else{
            
            Node new_node=new Node(data);
            //System.out.println("\n\t new_node :"+new_node+" ,new_node.data :"+new_node.data+" ,new_node.next "+new_node.next);
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
            
            Node new_node = new Node(data);
            //System.out.println("\n\t new_node :"+new_node+" ,new_node.data :"+new_node.data+" ,new_node.next "+new_node.next);
            new_node.next=last.next;

            last.next=new_node;

            last=new_node;

            return last;
        }
        
    }

    Node deleteToEnd(Node last){
        
        Node tnode=last.next;
        do{
            if(tnode.next==last){
                tnode.next=last.next;
                last=tnode;
            }
            tnode=tnode.next;
        } 
        while(tnode!=last.next);

        return last;
    }
}
class DeleteFromEnd{

    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;
        
        CircularLinkedList list = new CircularLinkedList();

        last=list.addToEnd(last, 5);

        last=list.addToEnd(last, 6);

        last=list.addToEnd(last, 7);

        last=list.addToEnd(last, 8);

        last=list.addToEnd(last, 9);

        list.displayList(last);

        last=list.deleteToEnd(last);

        list.displayList(last);

        last=list.deleteToEnd(last);

        list.displayList(last);
    }
}
