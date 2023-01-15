class FaceOffTournament{
      
    public static void main(String[] args) {
        
       //long[] arr = {1, 9, 9, 10, 9, 18};
       //long[] arr={6,12,60};
       long[] arr={7, 9, 14, 18, 6, 20, 35};

       String response=winner(arr.length, 7, 3, arr);

       System.out.println("\n\t "+response);
    }

    static String winner(int x, int m, int n, long arr[]){
        // code here
        int countRam=0;
        int countRohan=0;
        
        for(int i=0; i<x; i++){

            if(arr[i]%m==0){

                arr[i]=-1;
                countRam++;
            }
            if(arr[i]%n==0){
                countRohan++;
            }
        }
        

        if(countRam<countRohan){
            return "Rohan";
        }
        else if(countRam==countRohan){
            return "both";
        }
        else{
            return "Ram";
        }
        
    }
}