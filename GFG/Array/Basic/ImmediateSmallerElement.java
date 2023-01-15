class ImmediateSmallerElement{

    public static void main(String[] args) {
        
        //int[] arr= {4,2,1,5,3};
        int[] arr= {1,4,5,5,6,6};
       
        immediateSmaller(arr, arr.length);

    }

    static void immediateSmaller(int arr[], int n) {
        // code here

        for(int i=0; i<n; i++){
           
              if((i+1)<n && arr[i]<=arr[i+1]){
                arr[i]=-1;
                
              }
              
              else if((i+1)<n && arr[i]>=arr[i+1]){
                  arr[i]=arr[i+1];
                  
              }
              else if(i==(n-1)){
                 arr[i]=-1;
              }
            System.out.print(" "+arr[i]);
        }
    }
} 