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

    void push(int data){
        
        Node new_node = new Node(data);

        new_node.next=head;
        head=new_node;

    }

    int getCount(Node head){
        
        int count=0;
        Node tNode=head;

        while(tNode!=null){
            count++;
            tNode=tNode.next;
        }
        return count;
    }

    void dispayList(){
        Node tNode=head;
        System.out.println("\n\n");
        while(tNode!=null){
            System.out.print(" "+tNode.data);
            tNode=tNode.next;
        }
        System.out.println("\n\n");
    }
}
class CountLength{

    public static void main(String[] args) {
         
        LinkedList list = new LinkedList();

        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);

        list.dispayList();
        
        System.out.println(" Length of the Linked list is : "+list.getCount(list.head));
    }
}