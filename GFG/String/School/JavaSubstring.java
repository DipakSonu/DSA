class JavaSubstring {

    public static void main(String[] args) {
        
        String S="cdbkdub";
        int L=0;
        int R=5;

        
        System.out.println("\n\t Response : "+Solution.javaSub(S, L, R));
        
    }
} 
class Solution{

    public static String javaSub(String S, int L, int R) {
        // code here
        String str = S.substring(L, (R+1));
        return str;
    }
}