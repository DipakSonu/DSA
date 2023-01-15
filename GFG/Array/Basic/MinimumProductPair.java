class MinimumProductPair {

    public static void main(String[] args) {
        
       //long[] arr= {2, 7, 3, 4};
       long[] arr= {100000, 100000};
       long response= printMinimumProduct(arr, arr.length);
       System.out.println("\n\t Response : "+response);
    }

    public static long printMinimumProduct(long arr[], long n){

        long firstSmall=Long.MAX_VALUE;
        long secondSmall=0;
        
        for(int i=0; i<n; i++){
            
            if(firstSmall>arr[i]){
                secondSmall=firstSmall;
                firstSmall=arr[i];
            }
            else if(secondSmall>arr[i] /*&& arr[i]!=firstSmall*/){
                secondSmall=arr[i];
            }
            System.out.println("\n\t First : "+firstSmall+" Second : "+secondSmall);
        }
        
        return firstSmall*secondSmall;
    }
}