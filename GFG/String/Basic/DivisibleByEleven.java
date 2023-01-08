class DivisibleByEleven{

    public static void main(String[] args) {
        
        String S = "76945";

        String St="77";

        System.out.println("\n\t Response : "+isDivisibleBy11(S));
    }

    public static int isDivisibleBy11(String S){
        // Your Code Here
        int rem=0;
        int num=0;
        char val ='\u0000';

        char[] charArr = S.toCharArray();

        for(int i=0; i<S.length(); i++){

            val = (char) (charArr[i]);

            num=Integer.parseInt(String.valueOf(val));

            //System.out.println("\n\t 1.Num : "+num);
            
            num=(rem*10)+num;

            //System.out.println("\n\t 2.Num : "+num);

            rem=num%11;

            //System.out.println("\n\t Rex : "+rem);
           
        }

        if(rem==0){
            return 1;
        }
        else{
            return rem;
        }
        
    }
}