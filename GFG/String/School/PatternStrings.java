import java.util.*;
class PatternStrings{
      
    public static void main(String[] args) {
        
        String input = "Geeks";
        ArrayList<String> response= pattern(input);

        for (String str : response) {
            System.out.println("\n\t "+str);
        }
    }

    public static ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> al = new ArrayList<String>();
        S=S.replaceAll("\\s", "");
        String srt = S.trim();
        StringBuilder sb = new StringBuilder(srt);

        for (int i=sb.length(); i>0; i--) {

            if(sb!=null && i==sb.length()){
               al.add(sb.toString());
            }
            else if(i<=sb.length()-1){
                sb.setCharAt(i, '\u0000');
                al.add(sb.toString());
            } 
        }
        return al;
    }
}