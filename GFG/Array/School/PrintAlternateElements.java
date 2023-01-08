import java.util.Scanner;
class PrintAlternateElements{

    static int userInput;
    static int[] arr;

    public static void main(String[] args) {

       setArrayElement();

       displayAlternateElements();
    }

    public static void setArrayElement(){

      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t Enter the number of elements contain in array : ");
      userInput = sc.nextInt();

      arr = new int[userInput];
      System.out.println("\n\t Enter the elements of the array : ");
      for (int i=0; i<arr.length; i++){
         arr[i]=sc.nextInt();
      }
    }

    public static void displayAlternateElements(){

      for(int i=0; i<arr.length; i++){
        if(i%2==0){
          System.out.println(" \n\t Alternate element of array are : "+arr[i]);
        }
      }
    }
}
