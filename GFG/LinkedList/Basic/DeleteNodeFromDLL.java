class DoublyLinkList{
    
    Node head;

    class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    void append(int data){

        Node new_node = new Node(data);

        if(head==null){
            new_node.prev=null;
            new_node.next=head;
            head=new_node;
        }
        else{
            new_node.next=null;
            Node tNode=head;

            while(tNode.next!=null){
                tNode=tNode.next;
            }
            new_node.prev=tNode;
            new_node.next=null;
            tNode.next=new_node;
        }
    }

    Node deleteNode(Node head,int x){
	// Your code here
        Node tnode=head;
        int count=1;
        Node last=null;


        while(tnode!=null && count!=x){
            last=tnode;
            tnode=tnode.next;
            count++;
        }

        if(count==1){ 
            head=tnode.next;
            tnode.next.prev=null;
            tnode.next=null;
        }
        else if(tnode.next==null){
            tnode.prev.next=null;
            tnode.prev=null;
        }
        else{
            tnode.prev.next=tnode.next;
            tnode.next.prev=tnode.prev;
        }
        //System.out.println(" tnode "+tnode+" count "+count+" data "+last.data);
        return head;	
    }

    void displayList(Node head){
        Node tnode=head;
        Node last=null; 
        System.out.println("\n\n "+head);
        System.out.println("\n\n");

        while(tnode!=null){
            System.out.print(tnode.data+"-->>"+tnode.next+" ");
            last=tnode;
            tnode=tnode.next;
        }
        System.out.println("\n\n");
        while(last!=null){
            System.out.print(last.data+"-->>"+last.prev+" ");
            last=last.prev;
        }
        System.out.println("\n\n");
    }

    
}
class DeleteNodeFromDLL{

    public static void main(String[] args) {
        
        DoublyLinkList list = new DoublyLinkList();

        list.append(10);
        list.append(11);
        list.append(12);
        list.append(13);
        list.displayList(list.head);

        //DoublyLinkList response=list.deleteNode(list.head, 1);

        DoublyLinkList.Node response=list.deleteNode(list.head, 3);

        list.displayList(response);
    }
}