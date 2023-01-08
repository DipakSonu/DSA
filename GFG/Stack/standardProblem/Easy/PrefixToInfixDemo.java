import java.util.Stack;

class PrefixToInfixDemo{
    
    static String result="";
    
    static Stack<String> stack=new Stack<String>();
    
    public static void main(String[] args) {
        
        String exp="*-A/BC-/AKL";

        System.out.println("\n\n Infix "+convert(exp));
    }
    
    static boolean isOperator(char x){

        switch(x){

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

        System.out.println("\n\n length "+str.length());

        for(int i=(str.length()-1); i>=0; i--){

            char c=str.charAt(i);

            System.out.println("\n\n charAt("+i+") "+str.charAt(i));

            if(isOperator(c)){

                String op1=stack.pop();

                String op2=stack.pop();

                String temp="("+op1+c+op2+")";

                System.out.println("\n\n op1 "+op1+" op2 "+op2+" temp "+temp);

                stack.push(temp);
            }
            else{

                stack.push(c+" ");
            }
        }

        return stack.pop();
    }
    
}