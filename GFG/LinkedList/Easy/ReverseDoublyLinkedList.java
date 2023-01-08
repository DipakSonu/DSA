import javax.xml.transform.Templates;

class DoublyLinkedList{

    Node head;

    class Node{

        Node next;
        Node prev;
        int data;

        Node(int data){

            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    void append(int data){

        Node new_node = new Node(data);
        //System.out.println("\n\n data "+data+" new_node "+new_node);
        Node tnode=head;

        if(head==null){

            new_node.prev=null;
            new_node.next=head;
            head=new_node;
        }
        else{
            
            while(tnode.next!=null){
                tnode=tnode.next;
            }
            new_node.prev=tnode;
            new_node.next=null;
            tnode.next=new_node;
        }
    }

    void displayList(Node head){
            
            Node tnode=head;
            
            while(tnode!=null){

                System.out.print(" "+tnode.data);
                tnode=tnode.next;
            }
            System.out.print("\n\n ");

    }

    public Node reverseDLL(Node  head){
    //Your code here
        Node temp=head;
        Node last=null;
        Node tempIndex=null;
        Node lastduplicate=null;

        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        //System.out.println("\n\n last "+last);
        lastduplicate=last;
        
        while(last!=null){
            tempIndex=last.prev;
            last.prev=last.next;
            last.next=tempIndex; 
            //System.out.print(" "+last.data);
            last=last.next;
        }
        
        //System.out.println("\n\n last duplicate "+lastduplicate);
        head=lastduplicate;
        return head;
   }
}
class ReverseDoublyLinkedList{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(3);
        list.append(4);
        list.append(5);
        list.append(20);
        
        list.displayList(list.head);

    
        DoublyLinkedList.Node resp=list.reverseDLL(list.head);

        list.displayList(resp);
    }
}

