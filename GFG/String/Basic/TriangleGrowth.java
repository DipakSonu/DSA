class TriangleGrowth{
    
    public static void main(String[] args) {
        
        String str = "Geeks";
        printTriangleDownwards(str);
    }

    static void printTriangleDownwards(String str){
        // code here
        
        char[] chArr = str.toCharArray();

        for(int i=(chArr.length-1); i>=0; i--){
            
            

            System.out.println("\n\t arr["+i+"] : "+chArr[i]);
        }
    } 
}