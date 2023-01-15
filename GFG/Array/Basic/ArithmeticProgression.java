import java.util.Arrays;
class ArithmeticProgression{

    public static void main(String[] args) {

        int arr[] = { 0,12,4,8 ,15};

        System.out.println("\n\t Response : "+checkIsAP(arr, arr.length));
    }

    public static boolean checkIsAP(int arr[] ,int n){
        // code here
        Arrays.sort(arr);
        int commanDiff=Math.abs(arr[0]-arr[1]);;
        for(int i=0;i<n; i++){
            
            if((i+1)<n && arr[i]+commanDiff!=arr[i+1]){
               return false;
            }
           // System.out.println("\n\t Comman Difference : "+commanDiff);
        }
        return true;
    }
} 