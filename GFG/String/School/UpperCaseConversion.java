class UpperCaseConversion{

    public static void main(String[] args) {
        String inputStr="cg ax uv dm snjc ws a x nkr wdh ofni x bgxod m m r x kus a yap ajil bvmckzgnonlwuz azuvb";
        System.out.println("\n\t Response : "+transform(inputStr));
    }

    public static String transform(String s){
        // code here
        String str=s.trim();
        char[] charStr = str.toCharArray();
        int upperVal=0;
        int lowerVal=0;
        
        for(int i=0; i<charStr.length; i++){ 

            lowerVal=s.codePointAt(i);
      
            if(i==0){
               lowerVal = s.codePointAt(i);
               upperVal=(char)lowerVal-32;
               charStr[i]=(char)upperVal;
                 
            }

           else if (lowerVal==32) {
               int nextIdx=i+1;
               lowerVal=s.codePointAt(nextIdx);
               upperVal=lowerVal-32;
               charStr[nextIdx]=(char)upperVal;
           }        
        }
        String st = new String(charStr);
        return st;
    }
}
