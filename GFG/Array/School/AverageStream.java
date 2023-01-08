import java.util.Scanner;
class AverageStream{

  static int arrayCount;
  static int[] arr;
  static double sum=0;
  static double avg;
  public static void main(String[] args) {

    setArrayElement();

    displayAverageStream();
  }
  public static void setArrayElement(){

    Scanner sc = new Scanner(System.in);
    System.out.print("\n\t Enter the number of Element present in an Array : ");
    arrayCount = sc.nextInt();

    System.out.println("\n\t Enter the "+arrayCount+" element at this array : ");
    arr= new int[arrayCount];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
  }
  
  public static void displayAverageStream(){

      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        avg=sum/(i+1);
        System.out.println("\n\t Average Stream : "+avg);
      }
   }
}
