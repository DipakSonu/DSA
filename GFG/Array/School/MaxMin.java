import java.util.Scanner;
class MaxMin{

   public static void main(String[] args) {

     //int[] arr={10,2,15,8,50};

     int[] arr={67, 34, 0 ,69, 24, 78, 58, 62, 64, 5, 45, 81, 27, 61, 91, 905, 42,
        27, 36, 91, 4, 2, 53, 92, 82, 21, 16, 18, 95, 47, 26, 71, 38, 69, 12, 67, 99, 35, 94, 3, 11, -22};

     int[] ans = displayMaxMin(arr);

     System.out.println(" "+ans[0]+" "+ans[1]);
   }

   public static int[] displayMaxMin(int arr[]){
      int max=0;
      int min=arr[0];
      int[] res = new int[2];

      for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
          max=arr[i];
          //System.out.println("\n\t "+max);
        }
        else if(arr[i]<min){
          min=arr[i];
          //System.out.println("\n\t "+min);
        }
      }

      res[0]=max;
      res[1]=min;
      return res;
   }
}
