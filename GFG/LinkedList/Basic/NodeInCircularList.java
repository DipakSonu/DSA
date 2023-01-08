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

    Node addToEmpthy(Node last,int data){

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

    Node addToEnd(Node last,int data){

        if(last==null){
            return addToEmpthy(last, data);
        }
        else{

            Node new_node = new Node(data);
            
            new_node.next=last.next;

            last.next=new_node;

            last=new_node;

            return last;
        }
    }

    int countNodes(Node last){

        Node tnode=last.next;
        int count=0;


        do {
            tnode=tnode.next;
            count++;
        }
         while(tnode!=last.next);

         return count;
    }

    void dispayList(Node last){
        

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
class NodeInCircularList{

    public static void main(String[] args) {
        
        CircularLinkedList.Node last=null;
        
        CircularLinkedList list = new CircularLinkedList();

        last=list.addToEnd(last, 10);

        //last=list.addToEnd(last, 20);

        //last=list.addToEnd(last, 30);

        //last=list.addToEnd(last, 40);

        list.dispayList(last);

        System.out.println("\n\t Response : "+list.countNodes(last));
    }
}