class CountPairSum{

    public static void main(String[] args) {
        
       //int arr1[] = {1, 3, 5, 7};
       int arr1[]={2,6,8,10,11,14,15,18,19,22,24,25,35,37,39,42,52,54,57,64,66,68,69,79,80,82,84,86,89,90,91,92,93,98,99,100};
       //int arr2[] = {2, 3, 5, 8, 1 ,6};
       int arr2[]={6,8,15,24,26,27,28,29,33,35,38,42,65,68,83,87,90,94,96};

       int response = countPairs(arr1, arr2, arr1.length, arr2.length, 29);
       System.out.println("\n\t Response : "+response);


    }

    static int countPairs(int arr[],int brr[], int M, int N, int x) { 
        //code here.
    
        int count=0;

        for(int i=0; i<M; i++){

           int difference= x-arr[i];

           if(difference>0){

            for(int j=0; j<N; j++){
                if(difference==brr[j]){
                    System.out.println("\n\t brr["+j+"] : "+brr[j]);
                    count++;
                }
            }
           }     
        }
        
        return count;
    }
} 