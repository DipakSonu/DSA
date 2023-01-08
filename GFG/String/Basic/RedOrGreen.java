class RedOrGreen {

    public static void main(String[] args) {
        
        String inp="RRRGGRR";
        String in="GGGGGGR";
        
        System.out.println("\n\t Response : "+redOrGreen(inp.length(), in));
    }

   public  static int redOrGreen(int N, String S) {
        //code here
        int countRed=0;
        int countGreen=0;
        int convert=0;

        for (int i=0; i<S.length(); i++) {
            
            if(S.charAt(i)=='R'){
                countRed++;
            }
            else{
                countGreen++;
            }
        }
        
        if(countRed<countGreen){
            convert=S.length()-countGreen;
        }
        else{
            convert=S.length()-countRed;
        }

        return convert;
    }
}