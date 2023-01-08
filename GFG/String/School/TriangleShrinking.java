class TriangleShrinking {

    public static void main(String[] args) {
        //String str = "Geeks";
        String strs = "Jk?vCwyByJODWI";
        String strn = "Geeks";     
        System.out.println("\n\t "+triDownwards(strn));
    }

    public static String triDownwards(String S){
        
        S=S.replaceAll("\\s", "");
        String srt = S.trim();
        StringBuilder sb = new StringBuilder(srt);
        
        for(int i=0; i<sb.length()-1; i++) {
            
            if(sb!=null && i==0){
               System.out.println("\n\t "+sb);
            }  
            if(i<(sb.length()-2)){
               sb.setCharAt(i, '*');
               System.out.println("\n\t "+sb);
            }
            else if(i<(sb.length()-1)){
               sb.setCharAt(i, '*');
            }
        }
        return sb.toString();
    }
}
