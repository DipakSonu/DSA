import java.util.Arrays;
//import java.utils.Arrays;
class FindIndex{
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 5, 4, 5, 5 };
        //int[] arr={22 ,19, 17, 22, 30, 29, 16, 11, 26, 18, 28, 17, 19, 20, 28, 22, 13, 18, 13, 11, 20, 26, 23, 23, 25, 28, 19};
        //int[] arr = {21, 11, 30, 17, 30, 18, 13, 23, 10, 30, 11, 15, 21, 13, 13, 24, 25, 11, 15, 30, 15, 18, 13};
        int[] response = findArrayIndex(arr, arr.length, 5);

        for(int j=0; j<2;j++){
           
            System.out.println("\n\t Response["+j+"]"+response[j]);
        }
        
    }

    static int[] findArrayIndex(int arr[], int N, int key) 
    { 
        //code here.
        
        //Arrays.sort(arr);
        int index=0;
        int fIndex=Integer.MAX_VALUE;
        int lIndex=-1;
        int[] arrSecond=new int[N];

        for(int i=0; i<N; i++){

            if(arr[i]==key){
               index=i;
               
               if(fIndex>index){
                   fIndex=index;
               }
               if(lIndex<index){
                   lIndex=index;
               }
            }
        }

        if(fIndex==Integer.MAX_VALUE || lIndex==-1){
            arrSecond[0]=-1;
            arrSecond[1]=-1;
        }
        else{
            arrSecond[0]=fIndex;
            arrSecond[1]=lIndex;
        }
        

        return arrSecond;
    }
}