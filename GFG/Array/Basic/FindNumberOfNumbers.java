class FindNumberOfNumbers {

    public static void main(String[] args) {
        
        //int[] arr={11,12,45,17,18,19,22};
        int[] arr={526};
        int response = num(arr,arr.length,6);
        System.out.println("\n\t Response : "+response);
    }

    public static int num(int arr[], int n, int k){
        //Your code here
        String intStr="";
        int countK=0;
        
        for(int i=0; i<n; i++){
            
            intStr= String.valueOf(arr[i]);
            countK=getCount(intStr,countK,k);

        }
        return countK;   
    }

    public static int getCount(String intStr,int countK,int k){
        
        char charK=(char) (k+'0');

        for(int j=0; j<intStr.length();j++){

            char charDigit=intStr.charAt(j);

            if(charDigit==charK){
                countK++;
            }
        }

       return countK;
    }
}