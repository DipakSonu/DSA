import java.util.Arrays;
class PrintLeftElement{
    public static void main(String[] args) {
        
        int arr[] = {8, 1, 2, 9, 4, 3, 7, 5};

        System.out.println("\n\t "+displayPrintLeftElement(arr));  
    }

    public static int displayPrintLeftElement(int[] arr){

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

          System.out.print(" "+arr[i]+",");
        }
        int k = arr.length;
        int x = k/2;
        
        if(k%2==0){
            return arr[x-1];
        }
        else{
            return arr[x];
        }
    }
}