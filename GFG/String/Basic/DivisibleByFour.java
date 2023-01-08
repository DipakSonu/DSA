class DivisibleByFour{

    public static void main(String[] args) {
        
        String inp="94";

        System.out.println("\n\t Response : "+isDivisibleBy4(inp));
    }
    public static int isDivisibleBy4(String N){
        // Your Code Here

        int strLength = N.length();
        int rem=0;
        int num=0;
        String sum="";

        if(strLength<2){
            num=Integer.parseInt(N);
            rem=num%4;
        }
        else if(strLength>=2){

            for(int i=(strLength-2); i<=(strLength-1); i++){
                sum=sum+N.charAt(i);
                System.out.println("\n\t Sum "+sum);
            }
            num=Integer.parseInt(sum);
            
            rem=num%4;

            System.out.println("\n\t num "+num+" rem : "+rem);
        }
        
        if(rem==0){
            return 1;
        }
        else{
            return 0;
        }

        
    }
}