class RemoveCharacter{

    public static void main(String[] args) {
        
        String inp = "CCComaaaputtter";
        String inps = "Cat";

        System.err.println("\n\t Response : "+removeChars(inp, inps));
    }

    static String removeChars(String string1, String string2){
        // code here
        String str1=string1.trim();
        String str2=string2.trim();

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        for (int i=0; i<sb2.length(); i++) {

            for (int j=0; j<sb1.length(); j++) {

                System.out.println(" sb1 : charAt("+j+")"+sb1.charAt(j)+" Length : "+sb1.length());
                
                if(sb2.charAt(i)==sb1.charAt(j)){
                    
                    sb1.deleteCharAt(j);
                    System.out.println("\n\t sb2.charAt("+i+") "+sb2.charAt(i)+" sb1.charAt("+j+") "+sb1.charAt(j)+" sb1 : "+sb1+" j "+j);
                    j=j-1;
                    
                }
            }    
        }
        return sb1.toString();
    }
}