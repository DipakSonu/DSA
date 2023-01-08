import java.util.Scanner;
class PrintAnElement{

    static int n;
    static int[] arr;
    static int position;
    static Scanner sc;

    public static void main(String[] args) {

        setArrayElement();

        displayArrayAnElement();
    }

    public static void setArrayElement(){

        sc = new Scanner(System.in);
        System.out.print("\n\n Enter the number of element you want to store : ");

        n = sc.nextInt();
        arr= new int[n];

        System.out.println("\n\n Enter the elements of the array ");
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
    }

    public static void displayArrayAnElement(){

       System.out.print(" Enter the position of element which you want to display : ");
       position = sc.nextInt();
       position = position-1;

       if(position<n){

         System.out.println("\n Element of the desire position the arrey : "+arr[position]);
       }
       else{
         System.out.println("\n Your enter position element does not exit ");
       }
    }
}
