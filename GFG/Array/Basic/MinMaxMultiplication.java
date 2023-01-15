class MinMaxMultiplication{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        int brr[]={7,2,3,1,5,0,-8};
        
        long result=find_multiplication(arr, brr, arr.length, arr.length);
        
        System.out.println("\n\t "+result);
    }
    public static int findMaxElement(int[] arr){
       
        int bigBuddy=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
           if(arr[i]>bigBuddy){
              bigBuddy=arr[i];
           }
        }
        return bigBuddy;
    }

    public static int findMinElement(int[] brr){

        int littleBuddy=brr[0];

        for(int j=0; j<brr.length;j++){
            
            if(brr[j]<littleBuddy){
                littleBuddy=brr[j];
            }   
        }
        return littleBuddy;
    }

    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int maxElemet=findMaxElement(arr);
        int minElement=findMinElement(brr);

        return maxElemet*minElement;
    }
}