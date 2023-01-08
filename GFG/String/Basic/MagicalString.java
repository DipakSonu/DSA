class MagicalString {

    public static void main(String[] args) {
        
        String input="varun";

        System.out.println("\n\t Response : "+displayMagicalString(input));
    }

    static String displayMagicalString(String S){
        // code here
        
        StringBuilder sb = new StringBuilder(S);
        int changVal=0;

        for(int i=0; i<S.length(); i++){
            
            int charVal=sb.codePointAt(i);

            if(charVal<=77 && charVal>=65){
                changVal=65+(25-(charVal-65));
                sb.setCharAt(i, (char)changVal);
                
            }
            else if(charVal>77 && charVal<=90){
                changVal=90-(25-(90-charVal));
                sb.setCharAt(i, (char)changVal);
            }
            else if(charVal<=109 && charVal>=97){
                 changVal=97+(25-(charVal-97));
                 sb.setCharAt(i, (char)changVal);
            }
            else if(charVal>109 && charVal<=122){
               changVal=122-(25-(122-charVal));
               sb.setCharAt(i, (char)changVal);
            }
         }
         return sb.toString();
    }
}