import java.util.Scanner;
class FascinatingNumber{

    static int userInput;
    static Scanner sc;
    static int productOfTwo;
    static int productOfThree;
    static String strConcat;
    static String strUserInput;
    static String strProductOfTwo;
    static String strProductOfThree;
    static int visited = 1;


    public static void main(String[] args) {

      setNumber();

      if(userInput<100){
        System.out.println("\n\t Invalid number");
        System.exit(0);
      }
      else{
        if(isFacinatingNumber()){
          System.out.println("\n\t Given number is a Fascinating number ");
        }
        else{
          System.out.println("\n\t Given number is not Fascinating number ");
        }
      }
    }

    public static void setNumber(){

       sc = new Scanner(System.in);
       System.out.print("\n\t Enter a number : ");
       userInput = sc.nextInt();
    }

    public static String concatNumber(){

      productOfTwo = userInput*2;
      productOfThree = userInput*3;

      strUserInput = Integer.toString(userInput);
      strProductOfTwo = Integer.toString(productOfTwo);
      strProductOfThree = Integer.toString(productOfThree);

      strConcat = strUserInput+strProductOfTwo+strProductOfThree;

      strConcat=strConcat.replace("0","");

      return strConcat;
    }

    public static boolean isFacinatingNumber(){

      System.out.println("\n\t Number after concatination "+concatNumber());
      int[] freq = new int[10];

      for(int i=0; i<strConcat.length();i++){

         char intChar = strConcat.charAt(i);
         int digit = Integer.parseInt(String.valueOf(intChar)); //Converting digital character to it's digit int

        if(freq[digit]>0 && digit!= 0){
           System.out.println("\n\t freq[digit] : "+freq[digit]);
           return false;
        }
        else{
         freq[digit]=visited++;
         System.out.println("\n\t freq[digit] : "+freq[digit]+", Digit : "+digit+", Visited : "+visited);
        }
      }
      for(int i=1;i<freq.length; i++){
        if(freq[i]==0){
          return false;
        }
      }
       return true;
    }
}
