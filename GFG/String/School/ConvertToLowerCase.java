class ConvertToLowerCase{
    public static void main(String[] args) {
        
        System.out.println("\n\t Response : "+toLower("AbcdeF"));
    }

    public static String toLower(String S) {
        // code here
        String lowStr = S.toLowerCase();
        
        System.out.println("\n\t "+lowStr);

        return lowStr;
    }
}