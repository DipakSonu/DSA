import java.util.Scanner;
class SumOfArray{

   static int n; static int sum=0; static int arr[];

    public static void main(String[] args) {

        setArrayElement();
    }

    public static void setArrayElement(){

      Scanner sc = new Scanner(System.in);
      System.out.print("\n\n Enter the number of elements you want to store ");

       n = sc.nextInt();
       arr = new int[n];

       System.out.println("\n\n Enter the elements of the array ");

       for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
       }

       getArrayElement();
    }

    public static void getArrayElement(){

        System.out.println("Elements of the array are : ");

        for(int i=0; i<n; i++){
          System.out.println("  "+arr[i]);
        }

      displaySumOfArray();
   }

    public static void displaySumOfArray(){

        for(int i=0;i<n;i++){
          sum = sum+arr[i];
        }

        System.out.println("\n\n Sum of Element are : "+sum);
      }
}

//https://practice.geeksforgeeks.org/problems/c-arrays-sum-of-array-set-14805/1/?category[]=Arrays&category[]=Arrays&difficulty[]=-2&page=1&query=category[]Arraysdifficulty[]-2page1category[]Arrays
