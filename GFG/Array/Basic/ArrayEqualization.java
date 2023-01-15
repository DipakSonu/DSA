class ArrayEqualization {

    public static void main(String[] args) {

        //long arr[] ={1,3,2,0,4};
        //long arr[]={1,22,100};
        long[] arr={1,12,10};
        //long arr[]={1 ,3, 2, 0, 4, 8};

        long response= minOperations(arr, arr.length);
        System.out.println("\n\t Resonse : "+response);
    }

    public static long minOperations(long arr[], int N){
        
        long sum=0;
        double midPoint=0d;
        int midPoInt=0;
        int sumInt=0;

        for(int i=0; i<N; i++){
            
            sum=sum+arr[i];
            midPoint=(double)sum/N;
            midPoInt=(int)midPoint;

             
        }
        
        if(midPoInt==midPoint){

            for(int j=0; j<N; j++){
                int midAbs=(int)Math.abs(arr[j]-midPoint);
                sumInt=sumInt+midAbs;
            }

            return sumInt/2;
        }
        else{
            return -1;
        }
 
    }
}

