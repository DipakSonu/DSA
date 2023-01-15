class TwoNumberMaxProduct{

    public static void main(String[] args) {
        
       // int[] arr = {1, 100, 42, 4, 23};
       int[] arr = {6,6,6,6,6};

        int response = maxProduct(arr, arr.length);

        System.out.println("\n\t "+response);
    }

    public static int maxProduct(int arr[], int n) {
        // code here
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
           
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
            else if(second<arr[i]){
               second=arr[i];
            }
        }

        System.out.println("\n\t "+first+" , "+second);

        return (first*second);
    }
}