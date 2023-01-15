class RightReversalRotaion{

    public static void main(String[] args) {
        
        //int[] arr={1,2,3,4,5,6,7,8,9};

        int[] arr= {1,2,3,4,5};

        int arrLength=arr.length;
        int rightRotation=1%arrLength;

        rightArrayRotation(arr, arrLength-rightRotation, arrLength-1);
        rightArrayRotation(arr, 0, arrLength-(rightRotation+1));
        int[] response=rightArrayRotation(arr, 0, arrLength-1);
        
        for (int i : response) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static int[] rightArrayRotation(int[] arr,int startIndex, int endIndex){
       
        int lowIndex=startIndex;
        int highIndex=endIndex;

        while(lowIndex<highIndex){
            int lowValue=arr[lowIndex];
            int highValue=arr[highIndex];

            arr[lowIndex]=highValue;
            arr[highIndex]=lowValue;

            lowIndex+=1;
            highIndex-=1;
        }
        

       return arr;
    }
}