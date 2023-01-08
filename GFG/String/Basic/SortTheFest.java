import java.util.HashSet;

class SortTheFest {
    
    public static void main(String[] args) {
        
        String[] input1 = {"cake", "pastry", "fish", "candy", "meat"};

        String[] input2 = {"burger", "ham", "fish", "cake", "sauce"};

        System.out.println("\n\t Response : "+is_common(input1, input2));
    }

    public static String  is_common(String [] s, String [] t){
        // Code here
        HashSet<String>  hset = new HashSet<String>();

        for(int i=0; i<s.length;i++){
            
            if(!hset.contains(s[i])){
                hset.add(s[i]);
            }
        }
        
        for(int j=0; j<t.length; j++){
            
            if(hset.contains(t[j])){

                return "CHANGE";
            }
        }

        return "BE HAPPY"; 
    }
}

/*
 * int count=1;
        Arrays.sort(s);
        Arrays.sort(t);
        
        for(int i=0; i<s.length; i++){
            
            for(int j=0; j<t.length; j++){

                if(s[i]==t[j]){
                    System.out.println("s["+i+"] "+s[i]+" t["+j+"] "+t[j]);
                    count++;
                    System.out.println("s["+i+"] "+s[i]+" t["+j+"] "+t[j]);
                }
            }
        }

        if(count>=2){
            return "CHANGE";
        }
        else{
            return "BEHAPPY";
        }
 * 
 */