import java.util.Arrays;

class LexicographicArrang {

    public static void main(String[] args) {
        
        String str = "abcdefghijklmnop";
        System.out.println("\n\t Response : "+showLexi(str));
    }

    public static String showLexi(String str){
        
        StringBuffer sb = new StringBuffer(str);
        char[] arr = new char[sb.length()];
        String rex="";
        int count=0;

        for(int i=0; i<sb.length(); i++){

            int charCode = sb.codePointAt(i);

            arr[i]=(char)charCode;
               
        }
        Arrays.sort(arr);

        for(int j=(arr.length-1); j>=count; j--){

            rex=rex+String.valueOf(arr[j]);
        }
        
        return rex;
    }
}

