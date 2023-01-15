import java.util.Arrays;

class PythagoreanTriplet {

    public static void main(String[] args) {
        
       //int arr[] = {3, 2, 4, 6, 5};
        int arr[]={1,2,3};

        boolean response = checkTriplet(arr, arr.length);
        System.out.println("\n\t Response : "+response);
    }

    static boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        int k_val=0;

        for(int i=0; i<n; i++){
            
            for(int j=i+1; j<n; j++){
                
                sum=arr[i]*arr[i]+arr[j]*arr[j];
                
                for(int k=0; k<n;k++){
                
                    if(k!=j && k!=i){
                        k_val=arr[k]*arr[k];
                    }
                    if(k_val==sum){
                        return true;
                    }
                } 
            }   
        }
        return false;
    }
}

