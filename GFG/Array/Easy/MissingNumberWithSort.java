import java.util.Arrays;
class MissingNumberWithSort{
    
    public static void main(String[] args) {
        
        // int arr[] = {1, 4, 3, 2};
        int arr[] = {2};
       // int arr[]={1};

        int response = displayMissingNum(arr, (arr.length+1));

        System.out.println("\n\t "+response);
    }
    
    //With sorting 
    public static int displayMissingNum(int A[], int N){
         // Your code goes here
         
         Arrays.sort(A);
         int numArr=1;

         for(int i=0; i<N; i++){
             
            try {

                if(A[i]==numArr){
                    System.out.println("\n\t numArr : "+numArr+", arr["+i+"] "+A[i]);
                   numArr++;
                }
                
                else{
                    return numArr;
                }
                
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                return numArr;
            }
             
         }

         return numArr;
    }  
}