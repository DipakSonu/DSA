class LeftReversalRotation{
     
    public static void main(String[] args) {
        
    int[] arr={1,2,3,4,5,6,7};
        int arrLength=arr.length;
        int leftRotation=3%arrLength;
        leftArrayRotation(arr,0,leftRotation-1);
        leftArrayRotation(arr, leftRotation, arrLength-1);
        int[] response=leftArrayRotation(arr, 0, arrLength-1);

        for ( int i : response) {
            System.out.print(" "+i);
        }
        
    }

    public static int[] leftArrayRotation(int[] arr,int startIndex, int endIndex){
         
        int lowIndex=startIndex;
        int highIndex=endIndex;
        

        while(lowIndex<highIndex){
            int lowValue=arr[lowIndex];
            int highValue=arr[highIndex];

            arr[lowIndex]=highValue;
            arr[highIndex]=lowValue;

            lowIndex+=1;
            highIndex-=1;

            /*for(int i=0; i<arr.length;i++){
              System.out.print(" "+arr[i]);
            }
            System.out.print("\n");*/
        }
        return arr;
    }
}


