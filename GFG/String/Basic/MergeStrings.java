class MergeStrings {

    public static void main(String[] args) {
        
        String S1 = "Hello";
        String S2 = "Bye";

        String St1="Qh";
        String St2="eyNFX";

        String S3="rvcGbk";  
        String S4="QUWNOV";

        System.out.println("\n\t Response : "+merge(S3, S4));

    }
    public static String merge(String S1, String S2){ 
        // code here

        int n=S1.length()+S2.length();
        char[] arr= new char[n];
        
        int j=0;
        int k=0;

        for(int i=0; i<arr.length; i++){
            
            if(S1.length()<S2.length()){
                
                if(i%2==0 && j<S1.length()){
                    System.out.println("\n\t if i "+i+" j "+j);
                    arr[i]=S1.charAt(j);
                    j++;
                }
                else if(arr[i]=='\u0000' && k<S2.length()){
                    System.out.println("\n\t else i "+i+" k "+k);
                    arr[i]=S2.charAt(k);
                    k++;
                    
                }
            }
            else if(S2.length()<S1.length()){

                if(i%2!=0 && j<S2.length()){
                    System.out.println("\n\t if i "+i+" j "+j);
                    arr[i]=S2.charAt(j);
                    j++;
                }
                else if(arr[i]=='\u0000' && k<S1.length()){
                    System.out.println("\n\t else i "+i+" k "+k);
                    arr[i]=S1.charAt(k);
                    k++;
                    
                }
            }
            else if(S1.length()==S2.length()){

               if(i%2==0 && j<S1.length()){
                    System.out.println("\n\t if i "+i+" j "+j);
                    arr[i]=S1.charAt(j);
                    j++;
               }
               else if(i%2!=0 && k<S2.length()){
                    System.out.println("\n\t if i "+i+" k "+k);
                    arr[i]=S2.charAt(k);
                    k++;
               }
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.println("\n\t arr["+i+"] "+arr[i]);
        }
        String sb = new String(arr);
        return sb;
    }
}