class SecondLargestElement{

    public static void main(String[] args) {

      //int[] arr = {10 ,10, 10/*, 2, 14, 5,13*/};
       int arr[] = {-1,9,70,13,4,9,61,72,72,71};
       //int arr[] = {269,269,269,269,269,269,269,183};
       int n = arr.length;
       System.out.println(" SecondLargestElement is : "+print2largest(arr,n));

    }

  static int print2largest(int arr[], int n) {
       int  firstLarger = Integer.MIN_VALUE;
       int  secondLarger = Integer.MIN_VALUE;


       //System.out.println("\n\t First Larger : "+firstLarger+", Second Larger : "+secondLarger);

       for(int i = 0; i<n ; i++){
           if(arr[i] >firstLarger){
              secondLarger = firstLarger;
              firstLarger = arr[i];
           }
           else if(arr[i]>secondLarger &&  arr[i]!=firstLarger){

               secondLarger = arr[i];
           }
           else if(secondLarger==Integer.MIN_VALUE){
             secondLarger=-1;
           }
       }
       return secondLarger;

    }
}
