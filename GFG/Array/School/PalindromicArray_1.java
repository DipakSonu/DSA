class PalindromicArray_1{


  static int num;
  static int rem;
  static int val;

  static int originalValue;
  //static int multyplyNumber=100;

   public static void main(String[] args) {

      int[] arr = {111, 222, 333, 444, 20};
      int count=1;

      for(int i=0; i<arr.length; i++){

        if(arr[i]!=isPalindromicArray(arr[i])){
          count++;
        }
      }
      if(count!=1){
         System.out.println("\n\t Given array is not a Palindromic Array");
      }
      else{
          System.out.println("\n\t Given array is a Palindromic Array");
      }
   }

   public static int isPalindromicArray(int arrElement){

      num = arrElement;
      int sum=0;

      while(num!=0){
        rem=num%10;
        sum=sum*10+rem;
        num=num/10;
        //System.out.println("\n\t Rem : "+rem+", Sum : "+sum+", num : "+num);
      }
      System.out.println("\n\t Sum : "+sum);
      return sum;
   }
}
