class SecondSmallestElement {

    public static void main(String[] args) {

        //long[] arr ={2 ,4 ,3 ,5 ,6};
        long[] arr ={2 ,2 ,2 ,2 ,2};

        long[] response = minAnd2ndMin(arr, arr.length);

        for(int i=0; i<response.length;i++){
           System.out.println("\n\t "+response[i]);
        }
        
    }

    public static long[] minAnd2ndMin(long arr[], long n) {

        long firstMin=Integer.MAX_VALUE;
        long secondMin=Integer.MAX_VALUE;
        long[] response = new long[2];
        
        for(int i=0; i<n; i++){
           
            if(firstMin>arr[i]){
                secondMin=firstMin;
                firstMin=arr[i];
            }
            else if(secondMin>arr[i] && arr[i]!=firstMin){
                secondMin=arr[i];
            }

        }

        if(secondMin==Integer.MAX_VALUE){
            response[0]=-1;
            response[1]=-1;
            return response;
        }

        
        response[0]=firstMin;
        response[1]=secondMin;

        return response;
    }
}