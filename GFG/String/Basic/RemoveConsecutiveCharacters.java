class RemoveConsecutiveCharacters{
     
    public static void main(String[] args) {
        
        String input = "aaaaabbbbbbba";
        System.out.println("\n\t Response : "+removeCharacter(input));
    }

    public static String removeCharacter(String S){
        
        S=S.replaceAll("//s", "");
        StringBuffer sb = new StringBuffer(S);

        for (int i=0; i<sb.length(); i++) {
            
            if((i+1)<sb.length() && sb.charAt(i)==sb.charAt(i+1)){
                
                sb.deleteCharAt(i);
                System.out.println("\n\t Sb : "+sb+" Length : "+sb.length());
                i=i-1;
            }
        }
        
        return sb.toString();
    }
}