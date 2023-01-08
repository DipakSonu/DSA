class IsogramString{

    public static void main(String[] args) {
        
        String inp="dipak";

        System.out.println("\n\t Response : "+isIsogram(inp));
    }

    public static boolean isIsogram(String data){
        //Your code here
        int count=0;
        for (int i=0; i<data.length(); i++) {
            
            for (int j=i+1; j<data.length(); j++) {
                
                if(data.charAt(i)==data.charAt(j)){
                    System.out.println("\n\t i "+i+" j "+j);
                    count++;
                    break;
                }
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
       
    }
}