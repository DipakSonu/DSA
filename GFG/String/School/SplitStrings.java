import java.util.ArrayList;
import java.util.List;

class SplitStrings {

    
    public static void main(String[] args) {
        
        String str = "geeks01for02geeks03!!!";

        ArrayList<String> list= (ArrayList<String>) splitString(str);

        for (int i=0; i<list.size(); i++) {
            System.out.println("\n\t "+list.get(i));
        }
    }

    public static List<String> splitString(String S){ 
        // code here 
        String str = S.trim();
        ArrayList<String> al = new ArrayList<String>();
        StringBuilder sb = new StringBuilder(str);
        String strAlf="";
        String strDig="";
        String strKey="";
    
        for(int i=0; i<sb.length(); i++) {

            if(Character.isLetter(sb.charAt(i))){
                strAlf=strAlf+sb.charAt(i);
            }
            else if(Character.isDigit(sb.charAt(i))){
                strDig=strDig+sb.charAt(i);
            }
            else{
                strKey=strKey+sb.charAt(i);
            }
        }

        al.add(strAlf);
        al.add(strDig);
        al.add(strKey);
        
        return al;
    }

}