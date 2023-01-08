import java.util.Stack;
class InfixToPrefixDemo{
    
    static String result="";
    static Stack<Character> stack=new Stack<Character>();

    public static void main(String[] args) {
        
        //String exp="(A*B+C/D)";
        //String exp="(A-B/C)*(A/K-L)";
        //String exp="A+B*C/(E-F)";

        String exp="(K +L-M*N+(O^P)*W/U/V*T+ Q)";
        
        exp=exp.replaceAll("\\s", "");

        String revExp=reverseString(exp);
        
        System.out.println("\n\n Reverse String "+revExp);

        String finalResult=convert(revExp);

        System.out.println("\n\n Prefix  "+reverseString(finalResult));
    }

    public static String reverseString(String str){
        
        StringBuffer sb = new StringBuffer(str);

        String reverseStr=sb.reverse().toString();

        return reverseStr;

    }


    public static int precedence(char ch){

        switch(ch){

            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    public static String convert(String str){

        for (int i=0; i<str.length(); i++) {
            
            char ch=str.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){

                result=result+ch;

                //System.out.println("\n\n result "+result);
            }
            else if(ch==')'){
            
                stack.push('(');
                

                //System.out.println("\n\n Push "+pushElem);
            }
            else if(ch=='('){

                while(!stack.isEmpty() && stack.peek()!='('){
                    
                    result=result+stack.peek();
                    //System.out.println("\n\n 2 Result "+result);
                    stack.pop();
                }
                stack.pop();
            }
            else{
                
                //System.out.println("\n\n inside last else block "+stack.isEmpty());

                //System.out.println("\n\n precedence("+ch+") "+precedence(ch)+" , precedence("+stack.peek()+") "+precedence(stack.peek()));

                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    
                    result=result+stack.peek();
                    //System.out.println("3 Result "+result+" stack.peek "+stack.peek());
                    stack.pop();
                    
                }

                stack.push(ch);

                //System.out.println("\n\n stack.push() "+item);
            }
            
        }
        
        while(!stack.isEmpty()){
            
            if(stack.peek()==')'){
                return "Invalid Expression ";
            }
            else{
                result=result+stack.peek();
                //System.out.println("\n\n Inside displayResult method "+result);
                stack.pop();
            }
        }
        return result;
        
    }
}