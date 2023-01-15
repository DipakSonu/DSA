class MinMaxElement {

    public static void main(String[] args) {
        
        long[] arr= {3, 2, 1, 56, 10000, 167};
        //long[] arr={1, 345, 234, 21, 56789};

        long[] response = getMinMax(arr,arr.length);

        for(int i=0;i<2;i++){
            System.out.println("\n\t"+response[i]);
        }
        
    }

    static long[] getMinMax(long a[], long n) {
        //Write your code here

        int bigBuddy=Integer.MIN_VALUE;
        int smallBuddy=Integer.MAX_VALUE;

        for(int i=0; i<n;i++){
           
            if(bigBuddy<a[i]){
                bigBuddy=(int)a[i];
            }
            if(smallBuddy>a[i]){
              smallBuddy=(int)a[i];
            }
        }
        

        long[] ar = new long[2];
        ar[0]=bigBuddy;
        ar[1]=smallBuddy;

        return ar;
    }
    
}

