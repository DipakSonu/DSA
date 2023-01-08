class RockPaperScissors{
    
    public static void main(String[] args) {
        
        String S = "RP";

        System.out.println("\n\t Response : "+gameResult(S));
    }

    public static String gameResult(String s){
        // your code here
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)==s.charAt(i+1)){
                return "DRAW";
            }
            else if(s.charAt(i)=='R' && s.charAt(i+1)=='S'){
                return "A";
            }
            else if(s.charAt(i)=='P' && s.charAt(i+1)=='R'){
                return "A";
            }
            else if(s.charAt(i)=='S' && s.charAt(i+1)=='P'){
                return "A";
            }
            else{
                return "B";
            }

        }

        return "-1";
    }
}