//import java.text.DecimalFormat;

class LearningOutput{

    public static void main(String[] args) {
        
        long arr[] = {1,-1,2,2,3,0,5,-5,6,7}; //1 -1 2 2 3 0 5 -5 6 7
        //long arr[] = {7, 7, 7, 7, 7, 7, -9, -9, -9, 0};
        Learning(arr, arr.length);
        //double num = 29508.33333;
         //java.text.DecimalFormat obj=new java.text.DecimalFormat();
        //obj.setMaximumIntegerDigits(5);
       // obj.setMaximumFractionDigits(5);
      
       
        //System.out.print(String.format("%.1f",num));
        
       // System.out.println("\n\t Demo : "+obj.format(num));
    }

    public static void Learning(long arr[], long n){

        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        String pos=""; 
        String neg=""; 
        String zero="";
        String regex = "\\G[0-9]";
      

        java.text.DecimalFormat obj = new java.text.DecimalFormat("#,###.#####");
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher m=null;
        //java.text.DecimalFormat obj= new java.text.DecimalFormat();
        //obj.setMaximumFractionDigits(5);
        obj.setGroupingUsed(true);
        
        // Your code goes here

        for(int i=0; i<n; i++){
           
            if(arr[i]>0){
                positiveCount++;
                double posF=(double)n/positiveCount;
                pos=obj.format(posF); 
                m = p.matcher(pos);
                int posCount=0; 
                while(m.find()) {
                    posCount ++;
                }
                int pattern=6-posCount;
                if(posCount==5){
                  System.out.println(String.format("%."+pattern+"f",posF));
                }
            }
            else if(arr[i]<0){
                negativeCount++;
                double negF=(double)n/negativeCount;
                neg=obj.format(negF);
                m = p.matcher(neg);
                int negCount=0; 
                while(m.find()) {
                    negCount ++;
                }
                int pattern=6-negCount;
                if(negCount==5){
                  System.out.println(String.format("%."+pattern+"f",negF));
                }
            }
            else{
                zeroCount++;
                double zeroF=(double)n/zeroCount;
                zero=obj.format(zeroF);
                m = p.matcher(zero);
                int zCount=0; 
                while(m.find()) {
                    zCount ++;
                }
                int pattern=6-zCount;
                if(zCount==5){
                  System.out.println(String.format("%."+pattern+"f",zeroF));
                }
            }   
        }    
        System.out.println("\n\t pos "+pos+" neg "+neg+" zero : "+zero);
    }
}

/*
 * My output
 * 2.00111
   1.99903
  29508.33333

  java.text.DecimalFormat obj = new java.text.DecimalFormat("#,########.#####");
  2.00111
  1.99903
  29508.3

  float posFlot=(float)n/positiveCount;
                val=(int)Math.log10(posFlot)+1;
                pos=String.valueOf(posFlot);
                int pattern=6-val;
                if(val==1){
                    System.out.println(String.format(String.valueOf(pattern), posFlot));
    }

     GFG.pos="";
        GFG.neg="";
        GFG.zero="";
        // Your code goes here
        
        
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        String regex = "\\G[0-9]";
        
        
        java.text.DecimalFormat obj = new java.text.DecimalFormat("#,########.#####");
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher m=null;
        //obj.setMaximumFractionDigits(5);
        //obj.setGroupingUsed(true);
        //obj.setGroupingSize(3);
        // Your code goes here

        for(int i=0; i<n; i++){
           
            if(arr[i]>0){
                positiveCount++;
                GFG.pos=obj.format((double)n/positiveCount); 
                m = p.matcher(GFG.pos);
                int posCount=0; 
                while(m.find()) {
                    posCount ++;
                }
            
                if(posCount==5){
                  String.format("%.1f",GFG.pos);
                }
            }
            else if(arr[i]<0){
                negativeCount++;
                GFG.neg=obj.format((double)n/negativeCount);
                m = p.matcher(GFG.neg);
                int negCount=0; 
                while(m.find()) {
                    negCount ++;
                }
                
                if(negCount==5){
                   String.format("%.1f",GFG.neg);
                }
                
            }
            else{
                zeroCount++;
                GFG.zero=obj.format((double)n/zeroCount);
                m = p.matcher(GFG.zero);
                int zCount=0; 
                while(m.find()) {
                    zCount ++;
                }
                
                if(zCount==5){
                  String.format("%.1f",GFG.zero);
                }
            }   
        }
    }
 */