class MinDistanceBetweenTwoElements{

    

    public static void main(String[] args) {

    //int[] arr = {1,2}; 

      //int[] arr = {6, 15, 82, 8, 74, 59, 75, 83, 15, 36, 20, 39, 20, 60};

     //int arr[] = {1,2,3,2};

     //int arr[] = {13 98 5 10 23 13 4 53 60 78 66 68 44 69 79 71 90 17 91 84 34 52 12 11 57 61 2};

    int arr[] = {86,39,90,67,84,66,62};

     /*int arr[] = {96, 82, 48, 76, 34, 19, 7, 80, 36, 57, 77, 34, 19, 35,
                  5 ,57 ,16 ,66, 42, 62 ,89 ,19 ,60 ,19, 25 ,16 ,20 ,51,
                  77 ,75 ,12 ,73, 8 ,11, 100, 93, 81, 58, 72, 17, 14, 48,
                  2 ,33, 82, 6 ,41, 49, 72, 34,10, 12, 53, 21, 30, 77, 36, 49, 79, 13, 75, 42};*/



      int response=minDist(arr, arr.length, 1,2);

      System.out.println("\n\t "+response);

    }
    public static int minDist(int arr[], int n, int x, int y) {
        // code here
        int indexA=-1;
        int indexB=-1;
        int minDistance=Integer.MAX_VALUE;

        for(int i=0;i<n; i++){

            if(arr[i]==x){
              indexA=i;
              //System.err.println("\n\t IndexA "+indexA+", arr["+i+"] "+arr[i]);
            }
            if(arr[i]==y){
                indexB=i;   
            }
            if(indexA!=-1 && indexB!=-1){
               
              int distance = Math.abs(indexA-indexB);
              //System.out.println("\n\t Distance : "+distance);
              if(distance<minDistance){
                 minDistance=distance;
              }  
           }
        }
        if(minDistance<Integer.MAX_VALUE){
          return minDistance;
        }
        return -1;
        
    }
}