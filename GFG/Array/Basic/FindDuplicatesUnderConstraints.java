import java.util.*;
class FindDuplicatesUnderConstraints{

    public static void main(String[] args) {
        
       //int  A[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30};
        int A[]= {1, 2, 3, 3, 3, 3, 3, 5, 9, 10};

        System.out.println("\n\t Response : "+findDuplicate(A));
    }

    public static int findDuplicate(int A[]){
        // Your code goes here

        Arrays.sort(A);
        int count=1;
        int y=0;

        for (int i = 0; i < A.length; i++) {
            
            if((i+1)<A.length && A[i]==A[i+1]){
                y=A[i];
                count++;
            }   
        }
        
            return y; 
    }
} 