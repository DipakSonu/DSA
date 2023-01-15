class LastIndexOfOne{
    public static void main(String[] args) {
        
        String str = "11111111111111111111111111111111111";
        int response = lastIndex(str);
        System.out.println("\n\t Response : "+response);
    }

    public static int lastIndex( String str) {
        
        char[] charArr= str.toCharArray();
        int indexPosition=0;

        for(int i=0; i<charArr.length; i++){
           
            if(charArr[i]=='1'){
                System.out.println("\n\t If Length : "+charArr[i]);
                indexPosition=i;
            }
        }
        return indexPosition;
    }
}