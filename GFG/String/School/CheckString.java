class CheckString {

    public static void main(String[] args) {
        
        String input="g";
        System.out.println("\n\t Response : "+check(input));

    }

    public static Boolean check(String s){
        // your code here 
        char[] charArr=s.toCharArray();
        int charCount=1;
        
        for(int i=0; i<charArr.length; i++) {
            
            char chFirst=charArr[0];
            
            if((i+1)<charArr.length && chFirst==charArr[i+1]){
                charCount++;
            }

        }
        if(charCount==charArr.length){
            return true;
        }
        return false;
    }
} 