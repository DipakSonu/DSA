import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class ParenthesisChecker{

    public static void main(String[] args) {
        
        //String expr = "([{}])";
        //String expr="[";
        String expr = ")";
        //String expr="([)]";

        if(isBracketBalance(expr)){
            System.out.println("\n\n Balance  ");
        }
        else{
            System.out.println("\n\n Not Balance ");
        }
        
    }

    public static boolean isOpenBracket(char ch){

        switch(ch){

            case '[':
                return true;
            case '{':
                return true;
            case '(':
                return true;       
        }
        return false;
    }

    public static boolean isBracketBalance(String str){

        Deque<Character> stack=new ArrayDeque<Character>();

        for(int i=0; i<str.length(); i++){

            char ch=str.charAt(i);

            if(isOpenBracket(ch)){

                stack.push(ch);

            }
            else{

                switch(ch){
                    
                    case ']':
                        if(stack.isEmpty()){

                            return false;
                        }
                        if(stack.peek()!='['){
                            
                            return false;
                        }
                        if(stack.contains('[')){
                            stack.remove('[');
                        }
                        break;

                    case '}':
                        if(stack.isEmpty()){

                            return false;
                        }
                        if(stack.peek()!='{'){
                            
                            return false;
                        }
                        if(stack.contains('{')){
                            stack.remove('{');
                        }
                        break;
                        
                    case ')':
                        if(stack.isEmpty()){

                            return false;
                        }
                        if(stack.peek()!='('){
                            
                            return false;
                        }
                        if(stack.contains('(')){
                            stack.remove('(');
                        }
                        break; 
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
