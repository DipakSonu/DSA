class SecondLargestElement{

    public static void main(String[] args) {

        //int[] arr = { 2, 4, 5, 6, 7 };
        //int[] arr = {1,1,1,1,1};
        int[] arr ={18 ,20, 19, 2 ,1 ,19, 11, 6 ,12, 16, 8, 1 ,1 ,8 ,20, 1, 6, 7, 9};

        int response = print2largest(arr, arr.length);

        System.out.println("\n\t Response "+response);
    }

    public static int print2largest(int arr[],int N){
        //CODE HERE
        
        int bigBuddy=Integer.MIN_VALUE;
        int secondLargestBuddy=Integer.MIN_VALUE;


        for(int i=0;i<arr.length; i++){

            if(arr[i]>bigBuddy){
                secondLargestBuddy=bigBuddy;
                bigBuddy=arr[i];
                System.out.println("\n\t Bigbuddy : "+bigBuddy);
            }
            else if(arr[i]>secondLargestBuddy && arr[i]!=bigBuddy){
               secondLargestBuddy=arr[i];
               System.out.println("\n\t secondLargestBuddy : "+secondLargestBuddy);
            }

         }
         if(secondLargestBuddy==Integer.MIN_VALUE){
             secondLargestBuddy=-1;
         }

        return 10;
        
    }
} 