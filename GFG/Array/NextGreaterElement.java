class NextGreaterElement{

    public static void main(String[] args) {

        int arr[] = { 11, 13, 21, 3 };

        int n = arr.length;

        printNGE(arr, n);
    }

    static void printNGE(int[] arr, int n){
        
        int next;
        
        for(int i=0; i<n; i++){
            
            next=-1;

            for(int j=i+1; j<n; j++){

                if(arr[i]<arr[j]){

                    next=arr[j];

                    break;
                }
            }

            System.out.println(" "+arr[i]+"---->> "+next);
        }

    }
}