class PlayWithArray {

    public static void main(String[] args) {
        
        //int[] arr={0,1,2,3,4,5,6};
    int[] arr={6,4,9,8};

        int[] response=formatArray(arr, arr.length);

        for (int i : response) {
            System.out.println("\n\t "+i);
        }
    }

    public static int[] formatArray(int[] a,int n){
        
        for(int i=0; i<a.length;i++){
            
            int j=i+1;
            int temp=0;

            if(i<n && j<n){
               
                if(i%2==0 && j%2==1){
               
                    if(a[j]<a[i]){
                       temp=a[j];
                       a[j]=a[i];
                       a[i]=temp;
                    }
                }
            }
        }
        return a;
    }
}