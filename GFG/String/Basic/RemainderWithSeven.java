class RemainderWithSeven{

    public static void main(String[] args) {

        String inp="51525555495150565657515456565352495549";
    
        System.out.println("\n\t Response : "+remainderWith7(inp));
        
    }
    public static int remainderWith7(String num){
        // Your code here
        
        int currDigit; 
        int rem = 0;

        for (int i=0; i<num.length(); i++) {
              
          //Converting character to its integer value (num.charAt(i)-'0')
           //currDigit = rem * 10 + (num.charAt(i) - '0');
           currDigit = rem*10+Integer.parseInt(String.valueOf(num.charAt(i)));

           rem = currDigit%7;

        }
        return rem;
    }
}