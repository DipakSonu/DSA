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

    public void append(int data){

        Node new_node = new Node(data);
        
        System.out.println("\n data "+data+" "+"new_node "+new_node);
        
        if(head==null){
            new_node.next=head; 
            new_node.prev=null;
            head=new_node;
        }
        else{

            Node tnode=head;
            new_node.next=null;
            
            while(tnode.next!=null){
                tnode=tnode.next;
            }
            tnode.next=new_node;
            new_node.prev=tnode;
            
        }
    }

    public void inserAfter(Node prev_node,int data){
        

        Node new_node = new Node(data);

        System.out.println("\n data "+data+" "+"new_node "+new_node);
         
        Node tNode=head;

         System.out.println("\n tNode "+tNode);

        if(tNode!=prev_node){

            while(tNode!=prev_node){
                tNode=tNode.next;
            }
        }
        if(tNode==prev_node){
            
            System.out.println("\n\n tnode : "+tNode);

            new_node.prev=tNode;

            new_node.next=tNode.next;

            tNode.next=new_node;
            
            tNode=tNode.next;
            
            System.out.println("\n\n new_node.next "+new_node.next);

            if(new_node.next!=null){
                
                new_node.next.prev=new_node;
            }
            
            //System.out.println("\n\t else block new_node.prev "+new_node.prev+" tnode.next "+tnode.next+" tnode "+tnode);
            
        }

        
    }

    public void displayList(Node head){

        Node tnode=head;
        Node last=null;
        System.out.println("\n\n head "+head);
        System.out.println("\n");

        while(tnode!=null){
            last=tnode;
            System.out.print("<<--"+tnode.prev+"+"+tnode.data+"+"+tnode.next+"-->>");
            tnode=tnode.next;
        }
        
        
        System.out.println("\n\n head "+head);
        System.out.println("\n\n ");
        while(last!=null){
            System.out.print("<<--"+last.next+"+"+last.data+"+"+last.prev+"-->>");
            last=last.prev;
        }
        System.out.println("\n\n ");
        
    }
}
class AddAfterGivenNode{

    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();

        dList.append(15);
        dList.append(30);
        //dList.append(45);
        //dList.append(60);
        
        dList.displayList(dList.head);

        dList.inserAfter(dList.head.next, 29);

        dList.displayList(dList.head);
        
    }
}