import java.util.Arrays;
class MinimizeSumProduct {

    public static void main(String[] args) {
       long A[] = {6, 1, 9, 5, 4};
       long B[] = {3, 4, 8, 2, 4};

       long response= minValue(A,B,A.length);

       System.out.println("\n\t Response : "+response);
    }

    public static long minValue(long a[], long b[], long n) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);

        long sum=0;
        for(int i=0;i<n;i++){
             
            sum=sum+a[i]*b[(int)(n-(i+1))];
            //System.out.println("\n\t A["+i+"] "+a[i]+" b["+i+"] "+b[i]);
        }
        return sum;
    }
}