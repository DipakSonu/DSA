import java.util.Arrays;

class MaximizeSumOfArray{
    
    public static void main(String[] args) {
        
       int arr[] = {5, 3, 2, 4, 1};

       long response = Maximize(arr, arr.length);

       System.out.println("\n\t Response : "+response);
    }

    public static long Maximize(int arr[], int n){
        // Complete the function
        Arrays.sort(arr);
        long sum=0;
        Long mod = 1000000007L;
        for(int i=0;i<n; i++){
           //sum=sum+arr[i]*i;
           sum=(sum+((long)arr[i]*(long)i))%mod;
           System.out.println("\n\t sum : "+sum);
        }
        return sum;
    } 
}