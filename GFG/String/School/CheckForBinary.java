public class CheckForBinary{
   public static void main(String[] args) {
     
        System.out.println("\n\t Response : "+isBinary("501"));
   }

   public static boolean isBinary(String str){
	  //Your code here
      for (int i = 0; i <str.length(); i++) {
          
          if(str.charAt(i)!='1' && str.charAt(i)!='0'){
              return false;
          }
      }
      return true;
	}
}