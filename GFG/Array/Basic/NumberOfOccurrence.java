class NumberOfOccurrence{
    public static void main(String[] args) {
        
        int[] arr={1, 1, 2, 2, 2, 2, 3};

        System.out.println("\n\t "+count(arr,arr.length,2));

    }

    public static int count(int[] arr, int n, int x) {
        // code here
      int count=0;
      for(int i=0;i<n;i++){
          
        if(x==arr[i]){
          count++;
        }
      }
        return count;
    } 
}      