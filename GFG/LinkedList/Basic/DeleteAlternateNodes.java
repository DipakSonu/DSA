class LinkedList{

    public static Object list;
    Node head;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void insertFromEnd(int data){

        Node new_node=new Node(data);
        
        if(head==null){
            new_node.next=head;
            head=new_node;
        }
        else{
            Node tNode=head;

            while(tNode.next!=null){
                tNode=tNode.next;
            }
            tNode.next=new_node;
        }

    }
    void displayList(){

        Node tNode=head;

        System.out.println("\n\n Head "+tNode);
        System.out.println("\n\n ");

        while(tNode!=null){
            System.out.print(" "+tNode.data+"-->"+tNode.next);
            tNode=tNode.next;
        }
        System.out.println("\n\n ");
    }

    public void deleteAlternate (Node head){
        
        Node tnode=head;
        Node temp=head;
        
        while(tnode!=null){

            System.out.println("inside the tnode block ");

            while(temp.next==tnode.next && temp.next!=null){
                
                temp=temp.next; 
                System.out.println("inside the temp block "+temp);
            }
            //System.out.println("temp "+temp+" tnode "+tnode+" tnode.next "+tnode.next+" temp.next "+temp.next);

            tnode.next=temp.next;
            temp=temp.next;
        
            //System.out.println("After deleting node ");
            //System.out.println("temp "+temp+" tnode "+tnode+" tnode.next "+tnode.next+" temp.next "+temp.next);
            tnode=tnode.next;

            displayList();
        }
    }

    public void deleteNode(Node head){

    }
}
class DeleteAlternateNodes{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFromEnd(10);
        list.insertFromEnd(11);
        list.insertFromEnd(12);
        list.insertFromEnd(13);
        list.insertFromEnd(14);
        list.insertFromEnd(15);

        list.displayList();

        list.deleteAlternate(list.head);

        //list.displayList();
    }

    
}