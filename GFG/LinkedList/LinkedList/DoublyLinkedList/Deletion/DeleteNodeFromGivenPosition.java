class DoublyLinkedList{

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
        
        Node temp=head;

        //System.out.println("\n data "+data+" new_node "+new_node);

        if(head==null){
            
            new_node.prev=head;

            new_node.next=null;

            head=new_node;
        }
        else{
            
            while(temp.next!=null){
                temp=temp.next;
            }
            new_node.prev=temp;
            new_node.next=null;
            temp.next=new_node;
        }
    }

    void deleteNodeAtGivenPosition(int n){
        
        Node tnode=head;
        int count=1;

        while(tnode.next!=null && count!=n){
            tnode=tnode.next;
            count++;
        }

        System.out.println("\n\n tnode "+tnode+" count "+count);

        if(tnode.prev==null){

            tnode=tnode.next;

            tnode.prev=null;

            head=tnode;
        }
        else if(tnode.next==null){

            tnode.prev.next=null;

            tnode.prev=null;
        }
        else{
            
            tnode.prev.next=tnode.next;

            tnode.next.prev=tnode.prev;
        }
        
    } 

    void displayList(Node head){

        Node tnode=head;
        Node last=null;

        while(tnode!=null){
            last=tnode;
            System.out.print(" "+tnode.data);
            tnode=tnode.next;
        }
        System.out.println("\n\n ");

        while(last!=null){
            System.out.print(" "+last.data);
            last=last.prev;
        }
        System.out.println("\n\n ");
    }
}
class DeleteNodeFromGivenPosition{

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(5);
        list.append(15);
        list.append(25);
        list.append(35);
        list.append(45);

        list.displayList(list.head);

        list.deleteNodeAtGivenPosition(5);

        list.displayList(list.head);

        list.deleteNodeAtGivenPosition(1);

        list.displayList(list.head);

        list.deleteNodeAtGivenPosition(2);

        list.displayList(list.head);
    }
}