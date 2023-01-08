import java.util.Scanner;
class CountSmallerElement {

    static int num;
    static int[] arr;
    static Scanner sc;
    static  int userNum;
    static int count;

    public static void main(String[] args) {

       setArrayElement();

       compareArrayElement();

    }

    public static void setArrayElement(){

      sc = new Scanner(System.in);
      System.out.print("\n\n Enter the number of element you want to store : ");
      num = sc.nextInt();

      arr = new int[num];
      System.out.println("\n\n Enter the elements of the array ");

      for(int i=0;i<num;i++){

        arr[i] = sc.nextInt();
      }
    }

    public static  void compareArrayElement(){

      System.out.print(" Enter a number : ");
      userNum = sc.nextInt();

      for(int i=0; i<num; i++){

         if(userNum>=arr[i]){
            count++;
            System.out.print(" Number are : "+arr[i]+", ");
         }
      }
      System.out.println("\n\n Number of element : "+count);
    }
}
