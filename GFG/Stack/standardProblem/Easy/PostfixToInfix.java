import java.util.Stack;

class PostfixToInfix{
    
    public static void main(String[] args) {
        
        String exp="ABC/-AK/L-*";
        
        System.out.println("\n\n Response "+convert(exp));
    }

    public static boolean isOperator(char ch){

        switch(ch){
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            case '^':
                return true;
            case '%':
                return true;                
        }

        return false;
    }

    public static String convert(String str){
        
        Stack<String> stack=new Stack<String>();
        
        for(int i=0; i<str.length(); i++){

            char ch=str.charAt(i);

            if(isOperator(ch)){

                String op1=stack.pop();
                String op2=stack.pop();

                String temp="("+op2+ch+op1+")";

                stack.push(temp);
            }
            else{
                stack.push(ch+"");
            }
        }
        return stack.pop();
    }
}