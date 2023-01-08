import java.util.Scanner;
class EqualToIndexValue{

    static int arrayCount;
    static int[] arr;
    public static void main(String[] args) {

       setArrayElement();

       isElementToIndex();
    }

    public static void setArrayElement(){
      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t Enter the number of Element present in an Array :");
      arrayCount = sc.nextInt();
      arr = new int[arrayCount];
      System.out.println("\n\t Enter the "+arrayCount+" element at this array : ");
      for(int i=0;i<arrayCount;i++){
        arr[i]=sc.nextInt();
      }
    }

    public static void isElementToIndex(){
      for(int i=0; i<arr.length;i++){
        if(arr[i]==i+1){
          System.out.println("\n\t arr["+i+"]---)))"+arr[i]);
        }
      }
    }
}
