class TotalCount{

    public static void main(String[] args) {
        
        int[] arr={4,8,6,9,10};
        
        int response=totalCount(arr, arr.length, 3);

        System.out.println("\n\t "+response);
    }

    public static int totalCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        int rem=1;
        long sum=0;

         for (int i = 0; i<n; i++) {
            if(arr[i]%k>=1){
                count=arr[i]/k;
                sum=sum+count+rem;
            }
            else{
                count=arr[i]/k;
                sum=sum+count;
            }
         }
         return (int) sum;
    }
}