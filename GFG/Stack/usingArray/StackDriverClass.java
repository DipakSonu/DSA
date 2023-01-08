class Stack{

    static final int MAX=10;
    int top;
    int[] a = new int[MAX];
    
    Stack(){
        top=-1;
    }

    boolean isEmpty(){
        
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }

    boolean push(int x){
        
        if(top>=(MAX-1)){
            System.out.println("\n\n Stack is overflow");
            return false;
        }
        else{
            
            a[++top]=x;
            System.out.println("\n\n "+x+" pushed into stack"+" top "+top);
            return true;
        }
    }

    int pop(){

        if(top<0){
            System.out.println("\n\n Stack Underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    }
    int peek(){
        //this peek method return the top element of the stack
        if(top<0){
            System.out.println("\n\n Stack Underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
    }

    void print(){
        for(int i=top; i>-1; i--){
            System.out.print(" "+a[i]);
        }
        System.out.println("\n\n");
    }
}

class StackDriverClass{
    
    public static void main(String[] args) {

        
        /*s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");*/
        //s1.print();
        
        Stack s1 = new Stack();
        for(int i=0; i<10; i++){
            s1.push(i);
        }

        
        
        System.out.println(" Stack in s1 object ");
        for(int i=0;i<10; i++){
            System.out.println(" "+s1.pop());
        }

        
        //System.out.println(" is empthy "+s.isEmpty());
        
        

        
    }
}