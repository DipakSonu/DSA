import java.util.ArrayList;
class TotalDistanceTravelled{
    
    public static void main(String[] args) {

    int[] arr={5,1,4,3,2};
    //int[] arr={6, 5, 1, 2, 4, 3};
    //int[] arr={6,5,4,8,9,2,1,3,7};

        long response=distance(arr, arr.length);

        System.out.println("\n\t "+response);
    }

    
    public static long distance(int arr[], int n) {

        ArrayList<Integer> al= new ArrayList<Integer>();
        //int j=0 ; 
        int sum=0;
        for(int i=0;i<=n;i++){
          for(int j=0;j<n;j++) {
            if(i==arr[j]&&i!=0){ 
              al.add(j);
            } 
          }
        }
       for(int k=0;k<n-1;k++){
         int fN=al.get(k);
         int sN=al.get(k+1);
         sum=sum+Math.abs(fN-sN);
       }
        return sum;
    }  
}