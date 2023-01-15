class FightingTheDarkness{

    public static void main(String[] args) {
        
        long[] arr= {1,1,2};
        
        System.out.println("\n\t "+maxDays(arr, arr.length));
        
    }

    public static long maxDays(long arr[], int n){
        // code here 
        int bigBuddy=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
           
            if(bigBuddy<arr[i]){
                bigBuddy=(int) arr[i];
            }
        }

        return bigBuddy;
    }
} 