class SumArrayPuzzle{
    
    public static void main(String[] args) {
        
        int arr[] = {3, 6, 4, 8, 9};

        SumArray(arr, arr.length);
    }

    public static void SumArray(int arr[], int n){
        // your code here

        //System.out.println("\n\t "+totRot);
        
        for(int i=0; i<n;i++){
            
            int sum=0;

            for(int j=0; j<n; j++){
               
                if(i!=j){
                    
                    sum=sum+arr[j];
                }   
            }

            System.out.print(sum+" ");
        }   
    }
}