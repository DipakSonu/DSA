class RemoveCharactersFromAlphanumeric{

    public static void main(String[] args) {
        
        String input="AA1d23cBB4";

        System.out.println("\n\t Response : "+removeCharacters(input));
    }

    public static String removeCharacters(String S) {
        // code here
        
        StringBuilder sb = new StringBuilder(S);

        for(int i=0; i<sb.length(); i++){
           
            if(!Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                i=i-1; 
            }
        }

        return sb.toString();
    }
}