class BalancedArray{

    public static void main(String[] args) {
        
        long[] arr = {1,2,3,4,5,6};

        System.out.println("\n\t "+minValueToBalance(arr,arr.length));

        
    }

    public static long minValueToBalance(long[] arr,int n){

        long leftSide=0;
        long rightSide=0;
        long response=0;

        for(int i=0;i<n;i++){

            if(i<(arr.length/2)){
                leftSide=leftSide+arr[i];
                //System.out.println("\n\t "+leftSide);
            }
            else{
                rightSide=rightSide+arr[i];
                //System.out.println("\n\t "+rightSide);
            }

            //response=leftSide-rightSide;
       }
        if(leftSide<rightSide){
          response=rightSide-leftSide;
        }
        else{
         response=leftSide-rightSide;
        }
          
        return response;
    }
}
