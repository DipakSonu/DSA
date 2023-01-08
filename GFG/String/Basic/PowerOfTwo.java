class PowerOfTwo{

    public static void main(String[] args) {
        
        long num1=128;
        long num2=1099511627776L; //1099511627776; 9223372036854775807

        System.out.println("\n\t Response : "+isPowerofTwo(num1));
    }

    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long num=n;
        long quotient=0;
        long rem=0;

        if(num==1){

           return true;
        }
        else if(num==2){

            return true;
        }
        else{

            quotient=num/2;
            rem=num%2;
            System.out.println("\n\t Quotient : "+quotient+" Reminder : "+rem);

            while(quotient>=2 && rem==0){

                rem=quotient%2;
                quotient=quotient/2;
                
                System.out.println("\n\t if Quotient : "+quotient+" Reminder : "+rem);
            }
        }
        if(quotient==1 && rem==0){
            return true;
        }
        else{
            return false;
        }    
    }

}