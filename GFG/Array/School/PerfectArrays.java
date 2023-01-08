import java.util.Scanner;
class PerfectArrays {

    static int arr[];
    static int lowIndex;
    static int highIndex;
    static int count=1;

    public static void main(String[] args) {

      setArrayElement();

      isPerfectArray();

      if(count>1){
        System.out.println("\n\t Given Array is not a perfect Array");
      }
      else{
        System.out.println("\n\t Given Array is a perfect Array ");
      }
    }

    public static  void setArrayElement(){
      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t Enter the number of elements contain in array : ");
      int userInput = sc.nextInt();

      System.out.println("\n\t Enter the elements of the array : ");

      arr = new int[userInput];

      for(int i=0; i<userInput; i++){

         arr[i] = sc.nextInt();
      }

  }


  public static int isPerfectArray(){

    lowIndex=0;
    highIndex=arr.length-1;

    while(lowIndex<highIndex || lowIndex==highIndex){

      if(arr[lowIndex]!=arr[highIndex]){
        count++;
         System.out.println("\n\t Count : "+count);
      }

      lowIndex=lowIndex+1;
      highIndex=highIndex-1;
    }

    return count;
  }
}
