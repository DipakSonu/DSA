class ExceptionallyOdd{

    public static void main(String[] args) {
        
        //int arr[] = {1, 2, 3, 2, 3, 1, 3};

        int arr[] = {2 ,3 ,5 ,3 ,2, 5, 3 ,5, 3};

         int response =getOddOccurrence(arr, arr.length);

         System.out.println("\n\t "+response);
    }

    public static int getOddOccurrence(int[] arr, int n) {
        // code here
        int x=0;
        for(int i=0;i<n; i++){

                x=x^arr[i];
        }
        return x;
    }
}