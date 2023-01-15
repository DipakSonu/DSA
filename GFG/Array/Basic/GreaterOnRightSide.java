class GreaterOnRightSide {

    public static void main(String[] args) {
        
       //int arr[] = {16, 17, 4, 3, 5, 2};
      int[] arr={18,17,14,6,3};
       nextGreatestPro(arr, arr.length);
    }

    public static void nextGreatest(int arr[], int n) {
        // code here
        for(int i=0; i<n; i++){
           
            int big=Integer.MIN_VALUE;

            for(int j=i+1; j<n; j++){
                 
                if(big<arr[j]){
                    big=arr[j];   
                }
            }
            if(big==Integer.MIN_VALUE){
                big=-1;
            }

            arr[i]=big;  
        }

        for(int m=0; m<n; m++){
            System.out.print(" "+arr[m]);
        }
    }

    public static void nextGreatestPro(int arr[],int n){
          
        int temp=arr[n-1];
        System.out.println(" first "+temp);

        for(int i=(n-1); i>=0; i--){ 

            if(arr[i]<=temp  && i!=(n-1)){
                arr[i]=temp;           
                System.out.println(" if : "+temp);
            }

            else if(i==(n-1)){
                arr[n-1]=-1;
            }

            else if(arr[i]>temp){

               int localTemp=arr[i];
               arr[i]=temp;
               temp=localTemp; 
               System.out.println(" last : "+temp);
            }     
        }

        for(int j=0;j<n; j++){
            System.out.print(" "+arr[j]);
        }
    }
}

