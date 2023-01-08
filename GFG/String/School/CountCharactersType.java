class CountCharactersType {

    public static void main(String[] args) {
         
        String input="#GeeKs01fOr@gEEks07";
        int[] response=count(input);

        for (int i : response) {
            System.out.println("\n\t "+i);
        }
    }

    public static int[] count(String s){

        // your code here  
        int[] arr = new int[4];
        char[] charArr = s.toCharArray();
        int upperCount=0;
        int lowerCount=0;
        int digitCount=0;
        int specialCharCount=0;

        for (int i=0; i<charArr.length; i++){
             
            if(Character.isUpperCase(s.charAt(i))){
               upperCount++;
            }
            else if (Character.isLowerCase(s.charAt(i))) {
                lowerCount++;
            }
            else if(Character.isDigit(s.charAt(i))){
                digitCount++;
            }
            else{
                specialCharCount++;
            }
        }
       
       arr[0]=upperCount;
       arr[1]=lowerCount;
       arr[2]=digitCount;
       arr[3]=specialCharCount;

       return arr;
    }
}