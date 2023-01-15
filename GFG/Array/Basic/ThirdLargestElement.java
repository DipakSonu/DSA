class ThirdLargestElement {

    public static void main(String[] args) {
        
       //int A[] = {2,4,1,3,5};
       int A[]={15, 8 ,19, 12, 11};

       int response = thirdLargest(A, A.length);

       System.out.println("\n\t Response "+response);
        
    }

    public static int thirdLargest(int a[], int n){
	    // Your code here
        int bigBuddy=Integer.MIN_VALUE;
        int secondBuddy=Integer.MIN_VALUE;
        int thirdBuddy=Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if(bigBuddy<a[i]){
                thirdBuddy=secondBuddy;
                secondBuddy=bigBuddy;
                bigBuddy=a[i];
            }
            else if(a[i]>secondBuddy && a[i]!=bigBuddy){
               thirdBuddy=secondBuddy;
               secondBuddy=a[i];
            }
            else if(a[i]>thirdBuddy && a[i]!=secondBuddy){
                thirdBuddy=a[i];
            }
            System.out.println("\n\t Big "+bigBuddy+" second : "+secondBuddy+" third "+thirdBuddy);
        }
        if(thirdBuddy==Integer.MIN_VALUE){
            return -1;
        }
        return thirdBuddy;
    }
}