import java.util.*;
class EqualArray{

    public static void main(String[] args) {
        
      long  A[] = {1,2,5,4,0};
      long B[] = {2,7,5,0,1};

      boolean response = check(A, B, A.length);

      System.out.println("\n\t "+response);
    }

    public static boolean check(long A[],long B[],int N){
        //Your code here

        Arrays.sort(A);
        Arrays.sort(B);
        int count=0;

        for(int i=0;i<N; i++){
            //System.out.println("\n\t "+A[i]+"=="+B[i]);

            if(A[i]==B[i]){
                count++;
            }
        }

        if(count==N){
            return true;
        }

        return false;
    }
}