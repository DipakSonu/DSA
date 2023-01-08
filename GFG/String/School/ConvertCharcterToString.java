class ConvertCharcterToString {
    public static void main(String[] args) {
        
        char[] arr={'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        
        System.out.println("\n\t Response : "+chartostr(arr,arr.length));

        System.out.println("\n\t Response : "+chartostrPro(arr,arr.length));
    }

    public static String chartostr(char arr[], int N){
        
        String str="";

        for(int i = 0; i < arr.length; i++) {
            
            str=str+arr[i];
        }
        return str;
    }

    public static String chartostrPro(char[] arr, int N){
        
        String string = String.valueOf(arr);
 
        return string;
    }
}