class ReverseString {

    public static void main(String[] args) {
        
        System.out.println("\n\t Respose : "+revStr("Dipak"));
    }

    static String revStr(String S) {
        // code here
        char[] charStr = S.toCharArray();
        String str="";
    

        for (int i=charStr.length-1; i>=0; i--) {
             
            str=str+String.valueOf(S.charAt(i));
            
        }
        return str;
    }
}