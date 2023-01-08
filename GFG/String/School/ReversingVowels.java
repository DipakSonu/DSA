import java.util.ArrayList;

class ReversingVowels{

    public static void main(String[] args) {
    
        String inp = "awretgimnoxcu";
        System.out.println("\n\t Response : "+modify(inp));
    }

    public static String modify(String s){
        // your code here
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int j=0;

        for (int i=0; i<sb.length(); i++) {
            
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i'|| sb.charAt(i)=='o'|| sb.charAt(i)=='u'){
                
                al.add(i);
                //j++;
            } 
        }

        int lowIndex=0;
        int highIndex=al.size()-1;
        

        while(lowIndex<highIndex){

            int lowIndexVal=al.get(lowIndex);
            int highIndexVal=al.get(highIndex);
            char lowIndexChar=sb.charAt(lowIndexVal);
            char highIndexChar=sb.charAt(highIndexVal);

            sb.setCharAt(lowIndexVal, highIndexChar);
            sb.setCharAt(highIndexVal, lowIndexChar);

            lowIndex++;
            highIndex--;
        }

        

        return sb.toString();
    }
}