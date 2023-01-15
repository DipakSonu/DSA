import java.util.*;
class SwapMaximize{
    public static void main(String[] args) {
        
        //long[] arr ={4,2,1,8};
        //long[] arr={10,12};
        long[] arr = {1,6,2,5,3,4};

        long response=maxSum(arr, arr.length);

        System.out.println("\n\t Response "+response);
    }

    /*public static long maxSum(long[] arr ,int n){

        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        long sum=0L;
        while(i<j){
          
            sum=sum+Math.abs(arr[i]-arr[j]);
            sum=sum+Math.abs(arr[i+1]-arr[j]);
            i++;
            j--;
        }
        sum=sum+Math.abs(arr[0]-arr[i]);
        return sum;
    }*/

    public static long maxSum(long[] arr, int n){

        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        long sum=0;

        for(i=0; i<j; i++){
             
            sum=sum+Math.abs(arr[i]-arr[j]);
            sum=sum+Math.abs(arr[i+1]-arr[j]);
            j--;
        }
            sum = sum+Math.abs(arr[0]-arr[i]);
        return sum;
    }
} 