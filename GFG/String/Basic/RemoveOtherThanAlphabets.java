class RemoveOtherThanAlphabets{

    public static void main(String[] args) {
        
       String St = "$Gee*k;s..fo, r'Ge^eks?";
       String S =  "{{{}}> *& ^%*)";

       System.out.println("\n\t Response : "+removeSpecialCharacter(S));
    }

    public static String removeSpecialCharacter(String s) {

        // code here
        String str = s.replaceAll("\\s", "");
        System.out.println("\n\t Str "+str);
        StringBuilder sb = new StringBuilder(str);
        int count=0;

        for(int i=0; i<sb.length(); i++){

            if(!Character.isLetter(sb.charAt(i))){
                sb.deleteCharAt(i);
                i=i-1;
            }
            else{
                count++;
            }
        }
        if(count==0){
            return "-1";
        }
        else{
            return sb.toString();
        }
        
    }
}