import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

class UncommonCharacters {

    public static void main(String[] args) {
        
        String str1="geeksforgeeks";
        String str2="geeksquizgee";

        System.out.println("\n\t Response : "+UncommonChars(str1, str2));

    }

    public static String UncommonChars(String A, String B){
        // code here
        
        HashSet<Character> hset = new HashSet<>();
        
       for(int i=0; i<A.length(); i++){
            
            if(!hset.contains(A.charAt(i))){
                
                hset.add(A.charAt(i));
            }
       }

       //System.out.println("\n\t Ind "+ind);
        return "J";

    }
}


/*
 *  for(int k=0; k<map.size(); k++){
        Object[] keyMap = map.keySet().toArray();
        System.out.println("\n\t Value "+map.get(keyMap[k])+" Key : "+keyMap[k]);
    } 
 *  
    /*for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
        System.out.println("\n\t key : "+entry.getKey()+" Value : "+entry.getValue());
        // do something with key and/or tab
    }

    Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        

        
        int count=0;
        
        if(ALength>BLength){
            
            for (int i=0; i<sbA.length(); i++) { 
            
                for(int j=0; j<sbB.length(); j++){
    
                    if((sbA.charAt(i)==sbB.charAt(j)) && sbB.charAt(j)!='@'){
                        count++;
                        //map.put(sbA.charAt(i), count);
                    }
                    else if((sbA.charAt(i)!=sbB.charAt(j)) && sbB.charAt(j)!='@'){
                        System.out.println("\n\t else charAt("+i+") "+sbA.charAt(i)+" charAt("+j+") "+sbB.charAt(j));
                        map.put(sbA.charAt(i),count);
                    }
                    else if(sbB.charAt(j)!=sbA.charAt(i)){
                        System.out.println("\n\t else charAt("+i+") "+sbA.charAt(i)+" charAt("+j+") "+sbB.charAt(j));
                        map.put(sbA.charAt(i),count);
                    }
                }
 */