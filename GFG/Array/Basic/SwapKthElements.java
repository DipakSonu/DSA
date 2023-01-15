class SwapKthElements {

    public static void main(String[] args) {
        
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int arr[] = {5, 3, 6, 1, 2};
        swapKth(arr,arr.length,2);
    }

    public static void swapKth(int arr[], int n, int k) {
        // code here
        int lowIndex=(k-1);
	    int highIndex=arr.length-k;

            int lowVal = arr[lowIndex];
			int highVal = arr[highIndex];

            arr[lowIndex]=highVal;
			arr[highIndex]=lowVal;
       
        for(int i=0;i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n\n");
        
    }
    
} 