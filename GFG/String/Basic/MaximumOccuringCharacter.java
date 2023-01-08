import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class MaximumOccuringCharacter {

    public static void main(String[] args) {
        
        String inps = "GeeksForGeeks";
        String inp= "testsample";
        String in="abcdefabcdef"; //abcdefabcdef
        String i="Aa";
        
        System.out.println("\n\t Response : "+getMaxOccuringChar(i));
    }

    public static char getMaxOccuringChar(String line){
        // Your code here
        int count=1;
        Object[] keyHm=null;

        StringBuilder sb = new StringBuilder(line);
        Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();

        if(sb.length()>1){
            
            for (int i=0; i<sb.length(); i++) {
            
                for (int j=0; j<sb.length(); j++) {
                    
                    if(i!=j && Character.isLetter(sb.charAt(j))){
    
                        if(sb.charAt(i)==sb.charAt(j)){
                            sb.setCharAt(j, '@');
                            count++;
                        }
                        if(Character.isLetter(sb.charAt(i))){
                            mp.put(sb.charAt(i), count);
                        }  
                    } 
                }
                count=1;
            }
        }
        else{
            return sb.charAt(0);
        }

        for(int i=0; i<mp.size(); i++){

            keyHm = mp.keySet().toArray();

            if((i+1)<mp.size() && mp.get(keyHm[i])==mp.get(keyHm[i+1])){
                
               int x = Character.compare((char)keyHm[i], (char)keyHm[i+1]);  

                if(x>0){
                    mp.remove(keyHm[i]);
                    i=i-1;
                }
                else if(x<0){
                    mp.remove(keyHm[i+1]);
                    i=i-1;
                }
            }
            else if((i+1)<mp.size() && mp.get(keyHm[i])<mp.get(keyHm[i+1])){
                mp.remove(keyHm[i]);
                i=i-1;
            }
            else if((i+1)<mp.size() && mp.get(keyHm[i+1])<mp.get(keyHm[i])){
                mp.remove(keyHm[i+1]);
                i=i-1;
            }
        }

        /*for ( Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println("\n\t key : "+entry.getKey()+" Value : "+entry.getValue());
            // do something with key and/or tab
        }*/

        return (char) keyHm[0];
    }
}
