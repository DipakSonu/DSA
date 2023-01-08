class PrintFirstLetter {

    public static void main(String[] args) {

        String inp = "Geeks For Geeks";
        System.out.println("\n\t Response : "+firstAlphabet(inp));
        
    }
    public static String firstAlphabet(String S) {
        // code here
        
        String shortForm=String.valueOf(S.charAt(0));


        for(int i=1; i<S.length(); i++){
            
            //shortForm=shortForm;

            if(Character.isWhitespace(S.charAt(i))){

                shortForm=shortForm+(String.valueOf(S.charAt(i+1)));

                //System.out.println("\n\t if "+i+" "+S.charAt(i));
                System.out.println("\n\t if "+i+" shortForm : "+shortForm);
            }
           
        }

        return shortForm;
    }
} 