class IndexOfFirstOne {

    public static void main(String[] args) {
        
    long arr[] = {0, 0, 0, 0, 0/*, 0, 1, 1, 1, 1*/};

        long response = firstIndex(arr,arr.length);

        System.out.println("\n\t "+response);
    }

    public static long firstIndex(long arr[], long n){

        // Your code goes here

        for(int i=0; i<n; i++){

            if(arr[i]==1){
                return i;
            }
        }

        return -1;
    }
}