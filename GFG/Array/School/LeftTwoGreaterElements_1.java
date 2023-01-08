import java.util.Arrays;
class LeftTwoGreaterElements_1{

   public static void main(String[] args) {

     int[] arr = {7,5,2, 18, 54,44,34,22,43,15};
     int n=arr.length;

     int answer[] = findElements(arr, n);
     int sz = answer.length;
     StringBuilder output = new StringBuilder();

     for(int i=0;i<sz;i++)
       output.append(answer[i]+" ");
       System.out.println(output);
   }

   public static int[] findElements( int a[], int n){
         // Your code goes here
         Arrays.sort(a);
         int resultArray []  = new int[(int) n-2];
         for (int i=0;i<n-2;i++){
             resultArray[i] =a[i];
         }
         return resultArray;

   }
}
