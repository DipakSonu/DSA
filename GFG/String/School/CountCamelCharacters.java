class CountCamelCharacters {

    public static void main(String[] args) {
        
        System.out.println("\n\t Response : "+countCamelCase("HelloJava"));
    }

    public static int countCamelCase (String s){
        // your code here 

        int count=0;

        for (int i=0; i<s.length(); i++) {
            
            if(Character.isUpperCase(s.charAt(i))){
               count++;
            }
        }
        
        return count;
    }
}