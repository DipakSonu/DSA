class KeypadTyping {

    public static void main(String[] args) {
        
        String str = "geeksforgeeks";
        String strs="hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
        System.out.println("\n\t Response : "+printNumber(strs, str.length()));
    }
    public static String printNumber(String s, int n){
         //Your code here
         
         StringBuilder sb = new StringBuilder(s);

         for(int i=0; i<sb.length(); i++){

            if(sb.charAt(i)=='a'|| sb.charAt(i)=='b'|| sb.charAt(i)=='b'){
                sb.setCharAt(i, '2');
                i=i-1;
            }
            else if(sb.charAt(i)=='d'|| sb.charAt(i)=='e'|| sb.charAt(i)=='f'){
                sb.setCharAt(i, '3');
                i=i-1;
            }
            else if(sb.charAt(i)=='g'|| sb.charAt(i)=='h'|| sb.charAt(i)=='i'){
                sb.setCharAt(i, '4');
                i=i-1;
            }
            else if(sb.charAt(i)=='j'|| sb.charAt(i)=='k'|| sb.charAt(i)=='l'){
                sb.setCharAt(i, '5');
                i=i-1;
            }
            else if(sb.charAt(i)=='m'|| sb.charAt(i)=='n'|| sb.charAt(i)=='o'){
                sb.setCharAt(i, '6');
                i=i-1;
            }
            else if(sb.charAt(i)=='p'|| sb.charAt(i)=='q'|| sb.charAt(i)=='r' || sb.charAt(i)=='s'){
                sb.setCharAt(i, '7');
                i=i-1;
            }
            else if(sb.charAt(i)=='t'|| sb.charAt(i)=='u'|| sb.charAt(i)=='v'){
                sb.setCharAt(i, '8');
            }
            else if(sb.charAt(i)=='w'|| sb.charAt(i)=='x'|| sb.charAt(i)=='y' || sb.charAt(i)=='z'){
                sb.setCharAt(i, '9');
            }
         }
     
        return sb.toString();
   }
}

/*
 * 474486329565339347c87c94429536738993636987(mine)
 * 474486329565339347287294429536738993636987
 */