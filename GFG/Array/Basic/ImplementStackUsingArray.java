class MyStack{

    int top;
    int[] arr= new int[1000];

    MyStack(){
        top=-1;
    }
    void push(int a){
	    
        if(top<arr.length){
            arr[++top]=a;
        }
        else{
            System.out.println("\n\n Stack is Overflow");
        }
	}

    int pop(){
        // Your code here
        if(top<0){
            System.out.println("\n\n Stack is Uderflow");
            return -1;
        }
        else{
            int x=arr[top];
            top--;
            return x;
        }
        
	}
    void print(){
        for(int i=top; i>-1; i--){
            System.out.print(" "+ arr[i]);
        }
    }
}
class ImplementStackUsingArray{

    public static void main(String[] args) {
        
        MyStack s = new MyStack();
        s.push(78);
        s.pop();
        s.pop();
        s.pop();
        s.push(93);
        s.pop();
        s.pop();
        s.push(28);
        s.push(60);
        s.pop();
        s.push(41);
        s.push(73);
        s.push(12);
        s.push(68);
        s.push(30);

        System.out.println(s.pop() + " Popped from stack");
        System.out.print("Elements present in stack :");
        s.print();

    }


}