
class Demonitisation{

    public static void main(String[] args) {
        
        String S = "abc";
        String m = "ab";
        String n = "bc";
        
        System.out.println("\n\t Response : "+demonitize(S, m, n));
    }

    public static String demonitize(String S, String m, String n) {

        String strm = "";
        
        if(S.indexOf(m)!=-1){
           strm = S.replaceAll(m, "");
        }
        if(S.indexOf(n)!=-1){
           strm = strm.replaceAll(n, "");
        }
        /*else if(){
            
        }*/
        if(strm.isEmpty()){
            return "-1";
       }
        return strm; 
    }
}

/*
 *      String str = m+n;

        StringBuilder sb = new StringBuilder(S);

        StringBuilder sbM = new StringBuilder(str);
          
        for(int i=0; i<S.length(); i++){
            
            for(int j=0; j<sbM.length(); j++){
                try{
                        
                    if(sb.charAt(i)==sbM.charAt(j)){

                        System.out.println("\n\t  befor delet sb.charAt("+i+") "+sb.charAt(i));
                        sb.deleteCharAt(i);
                        //System.out.println("\n\t After deleting  sb.charAt("+i+") : "+sb.charAt(i));
                    }
                }
                catch(Exception err){
                    return "-1";
                }       
            }
        }
        
        return sb.toString();
 */