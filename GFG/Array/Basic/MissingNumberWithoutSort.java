class MissingNumberWithoutSort {

    public static void main(String[] args) {
        
        int[] A = {1, 2, 4, 5};
        //int[] A={5,7,9};
        int response = missingNumber(A, (A.length+1));

        System.out.println("\n\t Response : "+response);
    }

    public static int missingNumber(int A[], int N){
        // Your code goes here
        
        int sum=0;
        int answer=0;

        for(int i=0; i<N-1; i++){
           sum=sum+A[i];
           System.out.println("\n\t Sum : "+sum);   
        }

        answer=(N*(N+1)/2)-sum;
        
        return answer;
   }
}