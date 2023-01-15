import java.util.*;
class PartitionPoint {

    public static void main(String[] args) {
        
        long arr[] = {4, 3, 2, 5, 8, 6, 7};
        //long arr[] = {5, 6, 2, 8, 10, 9, 11,8,1} ;
        //long[] arr = {5,6,6,8,10,9,11};
        /*long[] arr ={698, 2126, 2827, 469, 1153, 1463, 559, 1838,
             2511, 2393, 2591, 420, 742, 1812, 357, 2550, 1426, 499,
              1898, 129, 2676, 365, 2847, 974, 2524, 921};*/

        System.out.println("\n\t Response : "+findElement(arr, arr.length));

    }

    /*public static long findElement(long arr[], int N) {
        // Your code goes here

        Arrays.sort(arr);
        int midPoint=(N-1)/2;
        int countLeft=0;
        int countRight=0;
        //System.out.println("\n\t Array Length : "+N+"  midoint : "+midPoint);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[midPoint] && i<midPoint){
                countLeft++;
                System.out.println("\n\t countLeft : "+countLeft+" arr["+i+"] "+arr[i]);
            }
            else if(arr[midPoint]<arr[i] && midPoint<i){
                countRight++;
                System.out.println("\n\t countRight : "+countRight+" arr["+i+"] "+arr[i]);
            }
        }
        int sum=countLeft+countRight;
        System.out.println("\n\t Sum "+sum);

        if(sum==(N-1)){
            return arr[midPoint];
        }
        else{
            return -1;
        }
       
    }*/
    
    public static long findElement(long a[], int n){ 

        long res = -1;

        for(int i=0;i<n;i++){

            int j = 0, k = i+1;
            //System.out.println("\n\t j:"+j+" k "+k);
            while(j<i && a[j]<a[i]){
                System.out.println("\n\t j "+j+" i "+i+" a["+j+"] "+a[j]+" a["+i+"] "+a[i]);
                j++;
            }
            
            while(k<n && a[k]>a[i]){
                System.out.println("\n\t k "+k+" n "+n+" a["+k+"] "+a[k]+" a["+i+"] "+a[i]);
                k++;
            }
            
            if(j==i && k==n){
                res = a[i];
                System.out.println("\n\t Res : "+res);
                break;
            }
        }
        return res;
    }
}