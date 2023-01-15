import java.util.Arrays;

class ProfessorAndParties {

    public static void main(String[] args) {
        
        long arr[] = {1, 3, 2, 4, 6, 5};
        System.out.println("\n\t "+partyType(arr, arr.length));
    }

    public static String partyType( long a[], int n){
        // Your code goes here
    
        Arrays.sort(a);
        for(int i=0; i<n; i++){

            if((i+1)<n && a[i]==a[i+1]){
               return "BOYS";
            }
        }
        return "GIRLS";
        
    }
}
