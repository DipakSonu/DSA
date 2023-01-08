import java.util.Stack;

class PairwiseConsecutive{
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();

        /*stack.push(1);
        stack.push(9);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(2);*/

        stack.push(62);
        stack.push(31);
        //stack.push(3);
        //stack.push(4);
        //stack.push(5);
        //stack.push(6);

        System.out.println("\n\n "+pairWiseConsecutive(stack));

    }
    public static boolean pairWiseConsecutive(Stack<Integer> st){
        // Your code here

        //System.out.println("\n\n "+st.size());

        if(st.size()%2!=0){
            System.out.println("\n\n Inside the odd ");
            st.pop();
            return displayResult(st);
            //return commanDifference(st);
        }
        else{ 
            System.out.println("\n\n Inside the even ");
            return displayResult(st);
            //return commanDifference(st);
        }
        
        //return true;
	}

    /*public static boolean commanDifference(Stack<Integer> st){
        
        int cdOutside=0;
        int cdInside=0;
        int topEl=st.pop();
        int nxtEl=st.pop();
        int popEl=0;

        cdOutside=topEl-nxtEl;

        System.out.println("\n\n cdOutside "+cdOutside);
        
        while(!st.isEmpty()){

            topEl=st.pop();
            nxtEl=st.pop();

            cdInside=topEl-nxtEl;

            if(cdOutside!=cdInside){
                return false;
            }
            //System.out.println("\n\n "+cd);
            
        }
        
        return true;
    }*/
    
    public static boolean displayResult(Stack<Integer> st){
        
        int topEl=0;
        int nxtEl=0;
        int diff=0;

        while(!st.isEmpty()){

            topEl=st.pop();

            nxtEl=st.pop();
            
            diff=topEl-nxtEl;

            System.out.println(" diff "+diff);
            
            if(diff>1 || diff==0 || diff<0){
                return false;
            }
        }
        
        return true;
    }
}