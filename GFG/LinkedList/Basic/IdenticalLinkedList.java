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
    void display(){

        Node tnode=head;
        System.out.println("\n head "+head);
        System.err.println("\n\n ");
        while(tnode!=null){
            System.out.print(" "+tnode.data);
            tnode=tnode.next;
        }
        System.err.println("\n\n ");
    }

    void insertNodeFromEnd(int data){
        
        Node new_node = new Node(data);

        if(head==null){
            new_node.next=head;
            head=new_node;
            return;
        }
        else{
            Node tnode=head;

            while(tnode.next!=null){
                tnode=tnode.next;
            }
            tnode.next=new_node;
        }
    }
    
}

class IdenticalLinkedList {


    public static void main(String[] args) {
    
        
        LinkedList list1 = new LinkedList();

        list1.insertNodeFromEnd(1);
        list1.insertNodeFromEnd(2);
        list1.insertNodeFromEnd(3);
        list1.insertNodeFromEnd(4);

        list1.display();


        LinkedList list2 = new LinkedList();

        list2.insertNodeFromEnd(1);
        list2.insertNodeFromEnd(2);
        list2.insertNodeFromEnd(3);
        list2.insertNodeFromEnd(4);

        list2.display();

        System.out.println("\n\t "+isIdentical(list1.head, list2.head));
    }

    static boolean isIdentical(LinkedList.Node head1, LinkedList.Node head2){
        

        LinkedList.Node tNode1=head1;
        LinkedList.Node tNode2=head2;

        int nodeCount1=getCount(tNode1);
        int nodeCount2=getCount(tNode2);
        int count=0;

        if(nodeCount1==nodeCount2){
            
            while(tNode1!=null && tNode2!=null){
    
                if(tNode1.data==tNode2.data){
                    count++;
                }
                tNode1=tNode1.next;
                tNode2=tNode2.next;
            }
            
            if(count==nodeCount1 && count==nodeCount2){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            
            return false;
        }
    } 

    static int getCount(LinkedList.Node head){
        
        int count=0;
        LinkedList.Node tNode=head;

        while(tNode!=null){
            count++;
            tNode=tNode.next;
        }
        return count;
    }
}
