class SearchAnElement {

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,6,7,3,7,8,3};

        int response = search(arr, arr.length, 33);

        System.out.println("\n\t "+response);
    }

    static int search(int arr[], int N, int X){
        
        // Your code here

        int elementIndex=0;

        for(int i=0; i<N; i++){

            if(arr[i]==X){
              elementIndex=i;
              return elementIndex;
            }
        }

        return -1;
        
    }

}