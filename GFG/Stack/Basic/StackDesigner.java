import java.util.ArrayList;
import java.util.Stack;

class StackDesigner{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //System.out.println("\n\n Respose "+_push(list, list.size()));
        
        Stack<Integer> stack=_push(list, list.size());

        System.out.println("\n\n "+stack);

        _pop(stack);
        
    }

    public static Stack<Integer>_push(ArrayList<Integer> arr,int n){
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<n; i++){
            //System.out.println("\n\n "+arr.get(i));
            stack.push(arr.get(i));
        }

        return stack;
    
    }
    public static void _pop(Stack<Integer> s){

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }   
            
    }
}