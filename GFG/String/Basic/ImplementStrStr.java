import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class ImplementStrStr{
    
    public static void main(String[] args) {
        
        String input="GeeksForGeeks";
        String inputs="ababaaaaaa";

        System.out.println("\n\t "+strstr(input, "For"));
    }

    public static int strstr(String s, String x){
        
         return s.indexOf(x);
        
    }   
}
