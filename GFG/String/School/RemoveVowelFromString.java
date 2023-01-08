class RemoveVowelFromString{

    public static void main(String[] args) {
        
        String input="welcome to geeksforgeeks";
        String inp="aaweeeieeiooaaoueeuhl";
        String inpt="<$uo?.*>"; //&lt;$?.*&gt;
        System.out.println("\n\t Response : "+removeVowels(inpt));
    }

    public static String removeVowels(String S) {
        // code here
        StringBuilder sb = new StringBuilder(S);

        for (int i=0; i<sb.length(); i++) {
            
            if(sb.charAt(i)=='a'){
               
               sb.deleteCharAt(i);
               i=i-1;
            }
            else if(sb.charAt(i)=='e'){
                sb.deleteCharAt(i); 
                i=i-1;  
            }
            else if(sb.charAt(i)=='i'){
                sb.deleteCharAt(i);
                i=i-1;
            }
            else if(sb.charAt(i)=='o'){
                sb.deleteCharAt(i);
                i=i-1;
            }
            else if(sb.charAt(i)=='u'){
                sb.deleteCharAt(i);
                i=i-1;
            }
        }
        
        return sb.toString();
    }
}