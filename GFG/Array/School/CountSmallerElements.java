import java.util.Scanner;
class CountSmallerElements {

    static int userInput;
    static int[] arr;
    static Scanner sc;
    static int compareableNumber;
    static int count=0;

    public static void main(String[] args) {

       setArrayElement();

       System.out.println("\n\t "+displayResult());
    }
    public static  void setArrayElement(){

      sc = new Scanner(System.in);
      System.out.print("\n\t Enter the number of elements contain in array : ");
      int userInput = sc.nextInt();

      System.out.println("\n\t Enter the elements of the array : ");
      arr = new int[userInput];

      for(int i=0; i<userInput; i++){
         arr[i] = sc.nextInt();
      }
    }

    public static int displayResult(){

      System.out.print("\t Enter a number : ");
      compareableNumber = sc.nextInt();

      for(int j=0; j<arr.length; j++){

        if(compareableNumber>=arr[j]){
           count++;
        }
      }
      return count;
    }
}
