import java.util.*;
import java.lang.*;
class LeftTwoGreaterElements{

    static int firstLargerEl;
    static int secondLargerEl;


   public static void main(String[] args) {

      int[] arr = {7,5,2, 18, 54,44,34,22,43,15};
      int n=arr.length;

      findTwoGreaterElements(arr);

      displayElement(arr);


   }

   public static void findTwoGreaterElements(int[] arr){

       int n = arr.length;
       firstLargerEl=Integer.MIN_VALUE;
       secondLargerEl=Integer.MIN_VALUE; //MIN_VALUE

       for(int i=0; i<n; i++){
         if(arr[i]>firstLargerEl){
           secondLargerEl=firstLargerEl;
           firstLargerEl=arr[i];
         }
         else if(arr[i]>secondLargerEl && arr[i]!=firstLargerEl){
           secondLargerEl=arr[i];
         }
       }
       System.out.println(" First Larger element : "+firstLargerEl+", Second Larger element : "+secondLargerEl);
    }

   public static void displayElement(int[] arr){

    for(int k=0; k<arr.length; k++){

       if(arr[k]!=firstLargerEl && arr[k]!=secondLargerEl){
         System.out.println(" "+arr[k]);
       }
    }
  }


}
