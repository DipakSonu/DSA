import java.util.Scanner;
class FascinatingNumberSeries{

    static int lowerRange;
    static int higherRange;
    static int productOfTwo;
    static int productOfThree;
    static String strConcat;
    static String strUserInput;
    static String strProductOfTwo;
    static String strProductOfThree;
    static int userInput;
    static int visited=1;
    static int no_of_FascinatingNumber;
    static int count;

    public static void main(String[] args) {

      setNumber();

      if(lowerRange<100){
        System.out.println("\n\t Invalid number");
        System.exit(0);
      }
      else if(higherRange<100){
        System.out.println("\n\t Invalid number");
      }
      else{

          System.out.println("\n\t Fascinating number are: ");

          for (int i=lowerRange;i<=higherRange; i++){
            if(isFacinatingNumber(i)){
              System.out.println(" "+i);
            }
          }
      }
    }

    public static void setNumber(){

      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t Enter the lowe range number : ");
      lowerRange = sc.nextInt();
      System.out.print("\n\t Enter the higher range number : ");
      higherRange = sc.nextInt();
    }

  public static String concatNumber(int i){

    userInput=i;
    productOfTwo = userInput*2;
    productOfThree = userInput*3;

    strUserInput = Integer.toString(userInput);
    strProductOfTwo = Integer.toString(productOfTwo);
    strProductOfThree = Integer.toString(productOfThree);

    strConcat = strUserInput+strProductOfTwo+strProductOfThree;
    strConcat=strConcat.replace("0","");

    return strConcat;
  }

  public static boolean isFacinatingNumber(int valueInt){

      String concatString = concatNumber(valueInt);
      int freq[] = new int[10];
      count=1;

      for(int i=0;i<concatString.length();i++){

        char intChar=strConcat.charAt(i);
        int digit=Integer.parseInt(String.valueOf(intChar));

        if(freq[digit]>0 && digit!= 0){
          return false;
        }
        else{
          freq[digit]=visited;
        }
      }
      for(int k=1;k<freq.length;k++){
        if(freq[k]==0){
          return false;
        }
      }
      return true;
    }
}
