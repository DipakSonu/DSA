class PlayWithOR{

    public static void main(String[] args) {
        
        int arr[ ] = {10, 11, 1, 2, 3};

        arr = game_with_number(arr, arr.length);

        for (int i : arr) {
            System.out.println("\n\t "+i);
        }
    }

    public static int[] game_with_number (int arr[], int n) {
        
        for(int i=0; i<n-1; i++){
            arr[i]=arr[i]|arr[i+1];
        }

        return arr;
    }
} 