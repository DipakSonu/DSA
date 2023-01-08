class ReverseString {

    public static void main(String[] args) {

        System.out.println("\n\t Respose : "+reverseWord("Dipak"));
    }

    public static String reverseWord(String S){
        // Reverse the string str
        char[] charStr = S.toCharArray();
        String str="";
    

        for (int i=charStr.length-1; i>=0; i--) {
             
            str=str+String.valueOf(S.charAt(i));
            
        }
        return str;
    }
}