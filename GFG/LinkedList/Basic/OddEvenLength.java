class LinkedList{

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

    void dispayList(){

        Node tNode=head;

        System.out.println("\n\n Head "+tNode);
        System.out.println("\n\n ");

        while(tNode!=null){
            System.out.print(" "+tNode.data+"-->"+tNode.next);
            tNode=tNode.next;
        }
        System.out.println("\n\n ");
    }
}
class OddEvenLength{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertFromEnd(10);
        list.insertFromEnd(11);
        list.insertFromEnd(12);
        list.insertFromEnd(13);
        list.insertFromEnd(14);

        list.dispayList();
        
        if(isLengthEvenorOdd(list.head)==0){
            System.out.println("\n\n Even");
        }
        else{
            System.out.println("\n\n Odd");
        }
    }

    static int isLengthEvenorOdd(LinkedList.Node head){
	    //Add your code here.
        LinkedList.Node tNode=head;
        int count=0;

        while(tNode!=null){
            
            count++;
            tNode=tNode.next;
        }
        int rem=0;
        rem=count%2;
        return rem;
	}
}