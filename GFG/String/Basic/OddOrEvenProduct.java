class OddOrEvenProduct{

    public static void main(String[] args) {
        
        String n1="11";

        String n2="12";

        System.out.println("\n\t Response : "+evenOdd(n1, n2));

    }

    public static int evenOdd(String n1 , String n2){
            //code here.
        
        char[] charArrN1 = n1.toCharArray();
        int remN1=0;
        int numN1=0;
        
        char[] charArrN2 = n2.toCharArray();
        int remN2=0;
        int numN2=0;
        
    
        for(int i=0; i<n1.length(); i++){
    
            numN1=Integer.parseInt(String.valueOf(charArrN1[i]));
    
            numN1=(remN1*10)+numN1;
    
            remN1=numN1%2;           
            
        }  
        
        System.out.println("Rex1 : "+remN1+" Num : "+numN1);

        for(int j=0; j<n2.length(); j++){

            numN2=Integer.parseInt(String.valueOf(charArrN2[j]));

            numN2 = (remN2*10)+numN2;

            remN2=numN2%2;
        }

        System.out.println("Rex2 : "+remN2+" Num : "+numN2);

        if(remN1==0 && remN2==0){
            return 1;
        }
        else if(remN1==0 && remN2!=0){
            return 1;
        }
        else if(remN1!=0 && remN2==0){
            return 1;
        }
        /*else if(remN1!=0 && remN2!=0){
            return 0;
        } */
        else{
            return -1;
        }  
    }
}