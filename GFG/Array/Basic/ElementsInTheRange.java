import java.util.Arrays;
public class ElementsInTheRange {
     
    public static void main(String[] args) {
        
        int arr[] =  {1, 4, 5, 2, 7, 8, 3};

        boolean response = check_elements(arr, arr.length,2,6);

       System.out.println("\n\t "+response);
    }
    
    public static boolean check_elements(int arr[], int n, int A, int B){
        
        Arrays.sort(arr);
        int count=0;
        int countVal=(Math.abs(A-B))+1;
         
       for(int i=0;i<n; i++){

          if(arr[i]==A && arr[i]<=B){
            count++;
            A++;  
          }
       }

       if(count==countVal){
           return true;
       }
        return false;       
    }
}