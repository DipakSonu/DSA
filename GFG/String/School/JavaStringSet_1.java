class JavaStringSet_1{

    public static void main(String[] args) {
        
        System.out.println("\n\t Response : "+conRevstr("Geeks", "forGeeks"));
    }

    public  static String conRevstr(String S1, String S2) {
        // code here
        String ans=S1+S2;
        System.out.println("\n\t Ans "+ans);
        char[] charStr = ans.toCharArray();
        String str="";

        for (int i=charStr.length-1; i>=0; i--) {
             
            str=str+String.valueOf(ans.charAt(i));    
        }
        return str;
    }
}