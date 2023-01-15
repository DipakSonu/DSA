public class TripletsWithZeroSum{

    public static void main(String[] args) {
        
        //int arr[] = {0, -1, 2, -3, 1};
        //int arr[] ={4, -16, 43, 4, 7, -36, 18};
        int[] arr = {6, 56, 93, -12, 26, 78, 79, 58, 53, 52, 51, 55, 77, -2, 61, -26, 91, 16, 100, -8, 72};

        boolean response = findTriplets(arr, arr.length);

        System.out.println("\n\t "+response);
    }

    public static boolean findTriplets(int arr[] , int n){
        //add code here.
        int sum=0;
        int m=1;
        for(int i=0; i<n; i++){
         
            for(int j=i+1;j<n;j++){
        
                for(int k=j+1;k<n;k++){

                    sum=arr[i]+arr[j]+arr[k];
                    
                    System.out.println("\n\t "+m+")"+i+","+j+","+k+" Sum--"+sum);
                    m=m+1;
                    if(sum==0){
                        return true;
                    }
                         
                }
            }
        }
        return false;
    }

} 