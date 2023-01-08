class CrazyString {

    public static void main(String[] args) {
        
        String S = "Geeks";
        String St = "eyNFX";

        System.out.println("\n\t Response : "+getCrazy(S));
    }

    public static String getCrazy(String s){
        //Your code here
        String firstLowerChar=s.toUpperCase();
        StringBuilder sb = new StringBuilder(firstLowerChar);
        

        for(int i=0; i<s.length(); i++){
            
            int codeAlfEvn=0;
            int codeAlfOdd=0;

            if(Character.isUpperCase(s.charAt(0))){

                if(i%2!=0 && i!=0){
                    codeAlfOdd=sb.codePointAt(i);
                    int newAlf=codeAlfOdd+32;
                    sb.setCharAt(i, (char)newAlf);
                }
            }
            else if(Character.isLowerCase(s.charAt(0))){    

                if(i%2==0){
                    
                   codeAlfEvn = sb.codePointAt(i);
                   int newAlf=codeAlfEvn+32;
                   sb.setCharAt(i, (char)newAlf);
                }  
            }
        }
        return sb.toString();
    }
}
