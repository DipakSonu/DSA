public class MinimumSumTwoElements{
    public static void main(String[] args) {
        
        /*int[] arr = {5,4,13,2,1};
        int[] brr = {5,3,4,2,1};*/
        //int[] brr={5,4,13,2,1};
        int[] arr = {1,6};
        int[] brr = {5 ,11};

        int response=minSum(arr, brr, arr.length);

        System.out.println("\n\t "+response);
    }

    public static int minSum(int a[], int b[], int n) {

        int bigBuddyA=Integer.MAX_VALUE;
        int bigBuddyB=Integer.MAX_VALUE;
        int indexA=0;
        int indexB=0;
        //int realNum=Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
           
            if(a[i]<bigBuddyA){
              bigBuddyA=a[i];
              indexA=i;
              System.out.println("\n\t IndexA : "+indexA+" , arr["+i+"] "+a[i]);
            }
            
            /*if(b[i]<bigBuddyB && indexA!=i){
                bigBuddyB=b[i];
                indexB=i;
                //sum=bigBuddyA+bigBuddyB;
                //System.out.println("\n\t Sum "+sum);
                //System.out.println("\n\t IndexA : "+indexA+" IndexB : "+indexB+", arr["+i+"] "+a[i]+" , brr["+i+"] "+b[i]/*+" Sum "+sum*///);
                /*if(sum<realNum){
                    realNum=sum;
                    //System.out.println("\n\t IndexB : "+indexB+" , brr["+i+"] "+b[i]+" Sum : "+sum);
                }
                System.out.println("\n\t IndexB : "+indexB+" , brr["+i+"] "+b[i]);*/
            //}*/  
            /*else{           
                System.out.println("\n\t IndexA : "+indexA+" IndexB : "+indexB+", arr["+i+"] "+a[i]+" , brr["+i+"] "+b[i]);
            } */    
        }
        for(int j=0;j<n;j++){
            if(b[j]<bigBuddyB && indexA!=j){
                bigBuddyB=b[j];
                indexB=j;
                System.out.println("\n\t IndexB : "+indexB+" , brr["+j+"] "+b[j]);
            }
        }
        sum = bigBuddyA+bigBuddyB;
        
        //System.out.println("\n\t A "+bigBuddyA+" B "+bigBuddyB);

        //System.out.println("\n\t IndexB : "+indexB+" IndexA : "+indexB);
        
        return bigBuddyA+bigBuddyB;
    }

    /*public static int minSum1(int a[], int b[], int n){
        int sum=0;
        int realNum=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){

            for(int j=0; (j<n); j++){
              
                if(i!=j){
                    sum=a[i]+b[j];
                    if(sum<realNum){
                        realNum=sum;
                        System.out.println("\n\t a["+i+"] :"+a[i]+" b["+j+"] "+b[j]+" Sum : "+sum);
                   }
                }
            }
        }
        return realNum;
    }*/
}