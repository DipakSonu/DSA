class ProductOfArray{

    public static void main(String[] args) {
        
        Long[] arr = {1L,2L,3L,4L};

        Long mod = 1000000007L;
       
        long response = product(arr, mod, arr.length);

        System.out.println("\n\t "+response);
    }

    public static long product(Long arr[], Long mod, int n)
    {
        //yout code here

        long mult=1;

        for(int i=0;i<n; i++){

           mult=(mult*arr[i])%mod;
    
           System.out.println("\n\t Multiply : "+mult);
        }
        return mult;
        //return mult%mod;
    }
}