class LowerToUpperCase{
    public static void main(String[] args) {
        
        String input="geeks";
        System.out.println("\n\t Response : "+to_upper(input));
    }

    public static String to_upper(String str){
        // code here
        String strn=str.trim();
        char charArr[] = strn.toCharArray();
        int lowerVal=0;
        int upperVal=0;

        for(int i=0; i<charArr.length; i++){
            lowerVal=str.codePointAt(i);
            upperVal=lowerVal-32;
            charArr[i]=(char)upperVal;
        }
        String stObj = new String(charArr);

        return stObj;
    }
}