class StringReversal{

    public static void main(String[] args) {
        
        String S = "GEEKS FOR GEEKS";

        //System.out.println("\n\t Response : "+reverseString(S));
        System.out.println("\n\t Response : "+reverse(S));
    }

    public static String reverseString(String s){
        //code here.
        String str=s.replaceAll("\\s", "");
        String strVal="";
        
        
        
        for(int i=0; i<str.length(); i++){
                
                int j;     

            for(j=i+1; j<str.length(); j++){
                
                if(str.charAt(i)==str.charAt(j)){  
                    break;      
                }
            } 
            if(j==str.length()){

                strVal=strVal+str.charAt(i);
            }
            
        }

        return strVal;
    }

    public static String reverse(String s){

        String str=s.replaceAll("\\s", "");
        System.out.println("\n\t str "+str);

        String revStr = "";
        for(int i=0; i<=str.length()-1;i++){
            if(revStr.indexOf(str.charAt(i))==-1){
                revStr = str.charAt(i)+revStr;
            }
        }
        System.out.println(revStr);
        return revStr;
    }
}
/*
 * Thrown by String methods to indicate that an index is either negative or greater
 *  than the size of the string. For some methods such as the charAt method, this 
 * exception also is thrown when the index is equal to the size of the string
 * 
 */
/*
 * for(int i=(str.length()-1); i>=0; i--){
            
            int j;

            for(j=i-1; j>=0; j--){
                
                //jVal=j;

                if(str.charAt(i)==str.charAt(j)){  

                    System.out.println(" if str.charAt("+i+") "+str.charAt(i)+"  str.charAt("+j+") "+str.charAt(j));
                    break;      
                }
               else{
                    System.out.println(" else str.charAt("+i+") "+str.charAt(i)+"  str.charAt("+j+") "+str.charAt(j));
                } 
            } 
            if(j==-1){
                
                strVal=strVal+str.charAt(i);
                System.out.println("\n\t strVal---->>>>"+strVal+" j "+j);
            }
            
        }

        return strVal;
 */
