import java.util.Stack;

class PrefixToPostfixDemo{

    public static void main(String[] args) {

        //String exp="*+AB-CD";

        String exp="*-A/BC-/AKL";
        
        System.out.println(" "+convert(exp));
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

        System.out.println("\n\n length "+str.length());

        Stack<String> stack=new Stack<String>();

        for (int i=str.length()-1; i>=0; i--) {
            
            char ch=str.charAt(i);

            System.out.println("\n\n charAt("+i+") "+str.charAt(i));

            if(isOperator(ch)){

                String op1=stack.pop();

                String op2=stack.pop();
                
                String temp=op1+op2+ch;

                System.out.println("\n\n op1 "+op1+" op2 "+op2+" temp "+temp);

                stack.push(temp);
            }
            else{
                stack.push(ch+"");
            }
        }
        return stack.pop();
    }
}