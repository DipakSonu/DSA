import java.util.Arrays;
class FormLargestNumber {

    public static void main(String[] args) {
        
       long arr[] = {9, 0, 1, 3, 0};
       System.out.println("\n\t "+maxNumberSB(arr, arr.length));
       
    }

    public static String maxNumber(long arr[], long n){
        //code here.
        Arrays.sort(arr);
        String strInt="";
    
        for(int i=(int)(n-1); i>=0; i--){
            strInt = strInt+String.valueOf(arr[i]);
    
        }

        return strInt;
    }

    public static int maxNumberInt(long arr[], long n){
        
        Arrays.sort(arr);
        long num=0;

        for(int i=(int)(n-1); i>=0;i--){
           
            num=(num*10+arr[i]);
        }

        return (int) num;
    }

    public static String maxNumberSB(long arr[], long n){

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
    
        for(int i=0; i<n; i++){
            sb.append(String.valueOf(arr[i]));
        }

        return sb.reverse().toString();
    }
}