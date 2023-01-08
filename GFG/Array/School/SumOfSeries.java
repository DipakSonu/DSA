import java.util.Scanner;
class SumOfSeries{

    static int userN;
    static int sum;

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("\t Enter the N value : ");
       userN = sc.nextInt();

       System.out.println("\n\t Sum of series : "+displaySumOfSeries(userN));
    }
    public static int displaySumOfSeries(int n){

      sum = (n*(n+1))/2;

      return sum;
    }

}
