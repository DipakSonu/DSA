class PerfectSquareString {

    public static void main(String[] args) {
        
        String S = "d";
        String St = "1Qy";

        System.out.println("\n\t Response : "+isSquare(St));
    }

    public static int isSquare(String S) {
        //code here
        StringBuffer sb = new StringBuffer(S);
        
        int charCode=0;
        int sum=0;

        for(int i=0; i<sb.length(); i++){
            
            charCode = sb.codePointAt(i);
            sum=sum+charCode;
        }
        
        int squSt = (int) Math.sqrt(sum);

        int res = (squSt*squSt);
        
        System.out.println("\n\t res : "+res+" Sum : "+sum);


        if(res==sum){
            return 1;
        }
        else{
            return 0;
        }
    }
}