class ChangeTheString{

    public static void main(String[] args) {
        
        String inp = "aSDFxcvtWRTY";
        System.out.println("\n\t Response : "+modify(inp));
    }
    public static String modify(String s){

        String str="";

        if(Character.isUpperCase(s.charAt(0))){
              
            str=s.toUpperCase();
            //System.out.println("\n\t if : "+str);
        }
        else if(Character.isLowerCase(s.charAt(0))){
               
            str=s.toLowerCase();
            //System.out.println("\n\t Inside else "+str);
        }
        return str;
    }
}