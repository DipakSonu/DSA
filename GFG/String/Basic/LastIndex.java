class LastIndex {

    public static void main(String[] args) {
        
        String S = "Geeks"; 
        char P = 'e';

        System.out.println("\n\t Response : "+displayLastIndex(S, P));
    }
    public static int displayLastIndex(String s, char p){
        // code here
        
        int ind=-1;

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)==p){
                
                ind=i;
            }
        }
        if(ind==-1){
            return -1;
        }
        else{
            return ind;
        }
        
    }
}