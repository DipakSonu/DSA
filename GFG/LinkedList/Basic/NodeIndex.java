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
        
        Node new_node = new Node(data);

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
        
        System.out.println("\n\n Head "+head);
        System.out.println("\n\n");

        while(tNode!=null){
            System.out.print(" "+tNode.data+"-->"+tNode.next);
            tNode=tNode.next;
        }
        System.out.println("\n\n ");
    }
}
class NodeIndex{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertFromEnd(5);
        list.insertFromEnd(15);
        list.insertFromEnd(51);
        list.insertFromEnd(13);

        list.dispayList();

        System.out.println("\n\t Response "+getNth(list.head, 3));
    }

    public static int getNth(LinkedList.Node head, int ind){
       //Your code here
       LinkedList.Node tNode=head;
       int count=1;
       int res=0;

       while(tNode!=null){
            
            System.out.println("inf "+tNode);

            if(ind!=count){
                //System.out.println("\n\t if "+tNode.data+" count "+count);
                count++;
                
            }
            else if(ind==count){
                res=tNode.data;
                //System.out.println("\n\t else "+tNode.data+" count "+count);
                break;
            }
            tNode=tNode.next;
            
       }

       return res;
    }
}