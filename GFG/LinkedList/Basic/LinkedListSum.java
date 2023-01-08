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
            new_node.next=null;
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }

    public int sum(Node head, int k){
        //write code here
        
        Node tnode=head;
        Node temp=head;
        int sum=0;
        int halt=0;
        int count=0;
        int index=0;

        while(tnode!=null /*&& count!=k*/){
            count++;
            tnode=tnode.next;
        }
        //System.out.println(" counr "+count+" tnode "+tnode);

        index=(count-k);
        //System.out.println(" Before index "+index+" temp "+temp);

        while(temp!=null && halt!=index){
            
            temp=temp.next;
            //System.out.println(" temp-->> "+temp);
            //index++;
            halt++;
        }
        //System.out.println(" After index "+index+" temp "+temp);

        while(temp!=null){
            
            sum=sum+temp.data;
            //System.out.println(" (temp) "+temp+" , "+sum);
            temp=temp.next;
        }

        return sum;
    }

    void displayList(Node head){
        
        Node tNode=head;

        System.out.println("\n\n Head "+tNode);
        System.out.println("\n\n ");
        while(tNode!=null){
            System.out.print(tNode.data+"-->>"+tNode.next+" ");
            tNode=tNode.next;
        }
        System.out.println("\n\n ");
    }
}
class LinkedListSum{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.apped(10);
        list.apped(9);
        list.apped(8);
        list.apped(7);
        list.displayList(list.head);
        int respose=list.sum(list.head,1);
        System.out.println("response "+respose);
    }
}