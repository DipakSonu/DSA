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

    void apped(int data){

        Node new_node=new Node(data);

        if(head==null){

            new_node.next=head;

            head=new_node;
        }
        else{

            new_node.next=head;

            head=new_node;
        }
    }

    Node reverseList(Node head){
        // code here
        Node tnode=head;
        Node temp=head;
        Node lstNode=null;
    
        //System.out.println("tnode "+tnode+" temp "+temp);
        while(tnode!=null && temp.next!=null){
            
            temp=temp.next;
            System.out.println("temp--> "+temp);
        
            tnode=tnode.next;
            temp.next=tnode;
            System.out.println("temp.next "+temp.next+" tnode "+tnode);
            
        }
        System.out.println("outside temp "+temp+" lstNode ");
        //head.next=null;
        //head=temp;

        return head;
    }

    void displayList(Node head){

        Node tnode=head;
        
        System.out.println("\n\n ");
        System.out.println("head "+head);
        System.out.println("\n\n ");

        while(tnode!=null){
            System.out.print(" "+tnode.data+"-->>"+tnode.next);
            tnode=tnode.next;
            
        }
        System.out.println("\n\n ");
    }
}
class ReverseLinkedList{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        list.apped(10);
        list.apped(9);
        list.apped(8);
        list.apped(7);
        list.displayList(list.head);
        LinkedList.Node response=list.reverseList(list.head);
        list.displayList(response);
    }
}