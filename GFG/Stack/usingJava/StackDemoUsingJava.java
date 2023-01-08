import java.util.Iterator;
import java.util.Stack;

class StackDemo{

    static void stack_push(Stack<Integer> stack){

        for(int i=0; i<5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        
        for(int i=0; i<5; i++) {
            
            Integer y = (Integer)stack.pop();
            System.out.println(y+" is poped from stack"+" i "+i+" stack_size "+stack.size());
        }
    }

    static void stack_peek(Stack<Integer> stack){

        Integer topElement=(Integer)stack.peek();

        System.out.println(topElement+" is the top element of stack ");
    }

    static void stack_search(Stack<Integer> stack, int element){

        Integer position = (Integer)stack.search(element);

        if(position==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at position: "+position);
        }
    }
}
class StackDemoUsingJava {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        StackDemo.stack_push(stack);
        StackDemo.stack_pop(stack);
        StackDemo.stack_push(stack);
        StackDemo.stack_peek(stack);
        StackDemo.stack_search(stack, 2);
        StackDemo.stack_search(stack, 6);

        Iterator itr = stack.iterator();

        while(itr.hasNext()){
            System.out.println(" itr "+itr.next());
        }
    }
}