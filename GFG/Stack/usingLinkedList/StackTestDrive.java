class StackAsLinkedList{
    
    StackNode root;
    StackNode top=null;

    class StackNode{

        int data;
        StackNode next;

        StackNode(int data){
            this.data=data;
            this.next=null;
        }
    }


    void push(int data){

        StackNode new_node = new StackNode(data);
        //System.out.println("\n\n data "+data+" new_node "+new_node);

        if(top==null){

            new_node.next=top;

            new_node.next=root;//root is  optioal to print the whole linked list

            root=new_node;

            top=new_node;
        }
        else{
            //StackNode top=root;
            new_node.next=null;
            //root = new_node;
            
            //new_node.next=top;

            top.next=new_node;

            top=new_node;
        }
        
    }

    void printStack(StackNode root){

        StackNode tnode=root;
        //System.out.println("\n\n Root "+root);
        System.out.println("\n\n ");

        while(tnode!=null){
            System.out.print(" "+tnode.data);
            tnode=tnode.next;
        }
        System.out.println("\n\n ");
        //System.out.println("\n\n top "+top+" top.data "+top.data+" top.next "+top.next);
    }

    public int pop(){
        
        StackNode tnode=root;
        int popData=0;
        
        //System.out.println(" top "+top);

        if(top==null){
            //System.err.println("\n\n Inside top block");
            return -1;
        }
        else if(root.next==null){
            //System.out.println("inside if block of pop ");
            popData=root.data;
            root=null;
            tnode=root;
            top=tnode;
            return popData;
        }
        else{
            
            while(tnode.next!=top && tnode.next!=null){
                tnode=tnode.next;
            }
            
            //System.out.println("tonde :"+tnode+" top "+top);
            popData=top.data;
            //System.out.println(" popdata "+popData+" top.data "+top.data);
            top=tnode;
            tnode.next=null;
            //System.out.println("tnode-->>"+tnode+" popdata "+popData);
            
        }
        return popData;
        //return 10;
    
    }
}
class StackTestDrive{
    
    public static void main(String[] args) {

        StackAsLinkedList list = new StackAsLinkedList();

        list.push(17);
        list.printStack(list.root);
        
        list.push(17);
        list.printStack(list.root);

        System.out.println(" "+list.pop()+" is pop from stack ");
        list.printStack(list.root);

        System.out.println(" "+list.pop()+" is pop from stack ");
        list.printStack(list.root);

        System.out.println(" "+list.pop()+" is pop from stack ");
        list.printStack(list.root);

    }
}
