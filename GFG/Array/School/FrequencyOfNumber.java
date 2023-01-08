import java.util.Scanner;
class FrequencyOfNumber{

   static int arr[];

    public static void main(String[] args) {

       setArray();

      checkFrequency();

    }

    public static void setArray(){

       Scanner sc = new Scanner(System.in);
       System.out.print("\n\t Enter the number of elements contain in array : ");
       int userInput = sc.nextInt();

       System.out.println("\n\t Enter the elements of the array : ");

       arr = new int[userInput];

       for(int i=0; i<userInput; i++){

          arr[i] = sc.nextInt();
       }
    }

    public static void checkFrequency(){

       int visitedArr[] = new int[arr.length];
       int visited = -1;
       //int count=1;

       for(int i=0; i<arr.length;i++){
          int count=1;
         for(int j=i+1; j<arr.length;j++){

           if(arr[i]==arr[j]){
             count++;
             visitedArr[j]=visited;
           }

         }
         if(visitedArr[i]!=visited){
           visitedArr[i]=count;
         }

       }
       for(int i=0;i<visitedArr.length;i++){
         if(visitedArr[i]!=visited){
           System.out.println("\n\t Frequecy of "+arr[i]+" : "+visitedArr[i]);
         }
       }
    }
}
