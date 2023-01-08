import java.util.*;
class SumOfNumbers{

    public static void main(String[] args) {
        
        String input="dip78ka9";

        System.out.println("\n\t Response : "+findSum(input));
    }

    public static long findSum(String str){
        // your code here
        ArrayList<String> al = new ArrayList<String>();
        String out = "";
        long sum=0;

        for (int i=0; i<str.length(); i++) {
            
            if(Character.isDigit(str.charAt(i))){
                
                if(i!=str.length()-1){
                    
                    if((i+1)<str.length()&& Character.isDigit(str.charAt(i+1))==false){
                        
                        out=out+str.charAt(i);
                        al.add(String.valueOf(out));
                        //System.out.println("\n\t if out "+out+" i : "+i+" char At "+str.charAt(i));
                        out = "";
                    }
                    else{
                        out = out+str.charAt(i);
                        //System.out.println("\n\t else1 out "+out+" i : "+i+" char At "+str.charAt(i));
                     }
                }
                else{  
                    out = out + str.charAt(i);
                    //System.out.println("\n\t else 2 outer else out: "+out+" charAt : "+str.charAt(i)+" i--"+i);
                    al.add(String.valueOf(out));
                    out = "";
                }
            }
        }

        for (int j=0; j<al.size(); j++) {
            
            sum=sum+Long.parseLong(al.get(j));
        }

        return sum;
    }
}