import java.util.HashSet;
import java.util.regex.*;

class RemoveConsonant{

    public static void main(String[] args) {
        
        String S = "bcdfgh";
        String St = "AeIoU";
        String Str= "aaio";
        
        System.out.println("\n\t Response : "+removeCons(S));

        System.out.println("\n\t Response : "+remove(St));
    }

    public static String remove(String s) {
        //code here.
        int count=0;
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<sb.length(); i++){
 

            if(sb.charAt(i)=='a' || sb.charAt(i)=='e'|| sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o'||sb.charAt(i)=='u'){
                count++;
            }
            else if(sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O'||sb.charAt(i)=='U'){

                count++;
            }
            else{
                sb.deleteCharAt(i);
                i=i-1;
            }
        }
        
        if(count==0){
            
            return "No Vowel";
        }
        return sb.toString();
    }

    public static String removeCons(String s) {
        
        String regex="[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";

        String result = s.replaceAll(regex, "");

        
        if(result.isEmpty()){

            return "No Vowel";
        }
    
        else{
            return result;
        }
        
    }
}
