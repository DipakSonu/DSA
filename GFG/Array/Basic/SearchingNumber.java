class SearchingNumber{

    public static void main(String[] args) {
        
        int[] arr={9, 7, 2, 16, 4};

        int response = search(arr, arr.length, 1);

        System.out.println("\n\t "+response);
    }

    public static int search(int arr[], int n, int k) {

        // code here
        int index=0;

        for(int i=0; i<n; i++){
            
            if(arr[i]==k){
                
                index=i+1;
                return index;
            }
        }
        //if()
        return -1;
    }
}