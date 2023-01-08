class RemoveSpaces{

    public static void main(String[] args) {
        
        System.out.println("\n\t Response : "+modify("Geek for Geek"));
    }

    public static String modify(String S){
        // your code here
        S = S.replaceAll("\\s", "");
        return S;
    }
}