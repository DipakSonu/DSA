import java.util.Scanner;
class PalindromicArray{

  static long userInput;//number of Array;
  static long arr[];
  static long num;
  static long rem;
  static long val;
  static long sum;
  static long length;
  static long multyplyNumber;
  static int count=1;
  static long arrayElements;


   public static void main(String[] args) {

      setArrayElement();

      for(int k=0;k<arr.length;k++){
        arrayElements=arr[k];

        if(!isPalindromicNumber(arrayElements)){
            count++;
        }
      }
      if(count>1){
        System.out.println("\n\t It is  not a Palindromic Array ");
      }
      else{
        System.out.println("\n\t It is a Palindromic Array ");
      }

   }

   public static void setArrayElement(){

      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t Enter the number of Element present in an Array :");
      userInput = sc.nextLong();
      arr = new long[(int)userInput];
      System.out.println("\n\t Enter the "+userInput+" element at this array : ");
      for(int j=0;j<userInput;j++){
        arr[j]= sc.nextLong();
        if(arr[j]<100){
          System.out.println("\n\t arr["+(j+1)+"] : "+arr[j]+" Invalid Array element ");
          System.exit(0);
        }
      }
   }

   public static boolean isPalindromicNumber(long arrElement){
      num = arrElement;
      sum=0;
      long digitLegth = findNumberLength(num);
      long multiLength = findMultiplyDigit();

      for(int i=0; i<digitLegth; i++){

        rem = num%10;
        sum = sum*10+rem;
        num = num/10;
      }

      if(sum==arrayElements){
        return true;
      }
      return false;
 }

  public static long findNumberLength(long i){

    length=0;
    long valNumber=i;

    while(valNumber!=0){
      valNumber = valNumber/10;
      length++;
    }
    return length;
  }

  public static long findMultiplyDigit(){

    multyplyNumber=1;

    for(int i=1;i<length;i++){
      multyplyNumber=multyplyNumber*10;
    }
    return multyplyNumber;
  }
}
