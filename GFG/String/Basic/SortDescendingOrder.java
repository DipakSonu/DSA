import java.util.Arrays;

class SortDescendingOrder{

    public static void main(String[] args) {
        
        String inp = "Geeks";

        System.out.println("\n\t Response : "+reverseSort(inp));
    }

    public static String reverseSort(String str){ 
        // code here
        StringBuffer sb = new StringBuffer(str);
        char[] arr = new char[sb.length()];
        

        for(int i=0; i<sb.length(); i++){

            if(Character.isLowerCase(sb.charAt(i))){
                
                int charCode = sb.codePointAt(i);
                arr[i]=(char)charCode;
            }
            else if(Character.isUpperCase(sb.charAt(i))){
                
                sb.deleteCharAt(i);
                i=i-1;
            }
            
        }
        Arrays.sort(arr);

        String obj = new String(arr);
        
        StringBuilder sbs = new StringBuilder(obj);

        sbs.reverse();

        return sbs.toString();
    }
}
