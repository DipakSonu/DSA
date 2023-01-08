import java.util.Scanner;
class LargerSmallerElement{

  static int[] arr;
  static int compareableNumber;
  static Scanner sc;

  public static void main(String[] args) {

    setArrayElement();

    System.out.print("\t Enter a number : ");
    compareableNumber = sc.nextInt();

    int[] ans = displayNumber();

    System.out.println("\n\t smaller : "+ans[0]+", Larger : "+ans[1]);
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

  public static int[] displayNumber(){

    int countMin=0;
    int countMax=0;
    int[] res = new int[2];

    for(int j=0; j<arr.length;j++){

      if(compareableNumber>=arr[j]){
        countMin++;
        //System.out.println("\n\t "+arr[j]+" is smaller than "+compareableNumber);
      }
      if(compareableNumber<=arr[j]){
        countMax++;
        //System.out.println("\n\t "+arr[j]+" is larger than "+compareableNumber);
      }
    }
    res[0]=countMin;
    res[1]=countMax;

    return res;
  }
}
