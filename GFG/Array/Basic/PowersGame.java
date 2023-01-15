class PowersGame{

    public static void main(String[] args) {
        
        int[] response = getFreq(15, 15);
        
        for(int i=0;i<10;i++){
            System.out.println("\t "+i+" : "+response[i]);
        }
    }

   public static int[] getFreq(int x, int n) {
        // code here
        String intStr= "";
        int[] digitArr=new int[10];
        long product=1;

        for(int i=0; i<n; i++){
            
            product=product*x;
            intStr= String.valueOf(product);
            getCount(intStr,digitArr);
        }
        
        return digitArr;
    }

    public static void getCount(String intStr, int[] digitArr){
        
        for(int j=0; j<10;j++){
            
            int  charInt=0;
            
            for(int k=0; k<intStr.length(); k++){
                 char charDigit= intStr.charAt(k);
                 charInt = Integer.parseInt(String.valueOf(charDigit));
                 
                 if(charInt==j && digitArr[j]==0){
                     int count=0;
                     count++;
                     digitArr[j]=count;
                     
                 }
                 else if(charInt==j && digitArr[j]!=0){
                    
                    int count=0;
                    count++;
                    digitArr[j]=count+digitArr[j];
                   
                }    
            }
        } 
    }
 }







