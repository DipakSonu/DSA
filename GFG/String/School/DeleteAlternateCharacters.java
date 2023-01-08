class DeleteAlternateCharacters {

    public static void main(String[] args) {
        
        System.out.println("\n\t Resonse : "+delAlternate("Hello"));
    }

    static String delAlternate(String S) {
        // code here

        StringBuffer sb=new StringBuffer(S);  

        for (int i = 0; i <sb.length()-1; i++) {
            
            int deletPosition=i+1;
            sb.deleteCharAt(deletPosition);
        }
        return sb.toString();
    }
}