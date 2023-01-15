class MultiplyLeftRightArraySum{
    
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //int[] arr = {1,2,3};

        System.out.println("\n\t "+multiply(arr, arr.length));
        
    }

    public static int multiply (int arr[], int n) {
    
        int[] a=new int[n/2];
        int[] b=new int[n-a.length];

        System.out.println("\n\t @rray A length  : "+a.length+", @rrar B length : "+b.length);
        //int[] b=new int[n/2];
        int sumA=0;
        int sumB=0;
        for(int i=0; i<n;i++){//>
            
            if(i<a.length){
                a[i]=arr[i]; 
                sumA=sumA+a[i];
                System.out.println("\n\t a["+i+"]"+a[i]+", Sum of array A : "+sumA);
            }
            /*else if(i<=b.length||i>=b.length){
               b[i-a.length]=arr[i];
               sumB=sumB+b[i-a.length];
               System.out.println("\n\t b["+i+"]"+b[i-a.length]+", Sum of array B : "+sumB);
            }*/
            else if(i>=(b.length-1)){
                b[i-a.length]=arr[i];
                sumB=sumB+b[i-a.length];
                System.out.println("\n\t b["+i+"]"+b[i-a.length]+", Sum of array B : "+sumB);
            }
            /*else{
                b[i-a.length]=arr[i];
                System.out.println("\n\t b[i] "+b[i-a.length]);
            }*/
        }
        return sumA*sumB;
    }
}