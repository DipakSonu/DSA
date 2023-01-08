import java.util.Arrays;

class SortTheString{

    public static void main(String[] args) {
        
        String inp="edcab";
        
        System.out.println("\n\t Response : "+sort(inp));
    }
    
    public static String sort(String s) {
        // code here
        
        StringBuffer sb = new StringBuffer(s);
        int[] arr = new int[sb.length()];
        
        for(int i=0; i<sb.length(); i++){
            
            int charCode = sb.codePointAt(i);

            arr[i]=charCode;

            System.out.println("\n\t "+sb.charAt(i)+"-----"+charCode);
        }
        
        Arrays.sort(arr);

        for(int j=0; j<arr.length; j++){
            
            //System.out.println("\n\t arr["+j+"] : "+arr[j]);
            sb.setCharAt(j, (char)arr[j]);
        }
        

        return sb.toString();
    }
}
/*
 * 
 */