import java.util.ArrayList;

class ExtractIntegers {
    
    public static void main(String[] args) {
        
        String input= "1: Prakhar Agrawal, 2: Manish Kumar Rai,48: Rishabh Gupta56";
        
        ArrayList<String> al = extractIntegerWords(input);

        for (String word : al){ 
            System.out.println("\n\t Response : "+word);
        }
    }

    public static ArrayList<String> extractIntegerWords(String s) { 
        // code here

        ArrayList<String> l1 = new ArrayList<String>();
        String out = "";

        for(int i=0;i<s.length();i++){

            if(Character.isDigit(s.charAt(i))){
                
                if(i!=s.length()-1){

                    if(Character.isDigit(s.charAt(i+1))==false){ 
                       out = out+s.charAt(i);
                       //System.out.println("\n\t i :"+i+" out --"+out+" chart At "+s.charAt(i));
                       l1.add(String.valueOf(out));
                       out = "";
                    }
                    else{
                      out = out+s.charAt(i);
                      //System.out.println("\n\t out "+out+" i : "+i+" char At "+s.charAt(i));
                   }
                }
               else{
                  
                  out = out + s.charAt(i);
                  //System.out.println("\n\t outer else out: "+out+" charAt : "+s.charAt(i)+" i--"+i);
                  l1.add(String.valueOf(out));
                  out = "";
               }
           }
       }
       return l1;
        
    }
}
