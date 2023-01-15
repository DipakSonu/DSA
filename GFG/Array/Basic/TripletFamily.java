import java.util.ArrayList;
class TripletFamily {

    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5};
        //int[] arr={8, 10, 16, 6, 15, 25};
        //int[] arr = {394, 846, 216, 41, 211, 891, 103, 714, 233, 147, 
            //547, 630, 293, 295, 474, 489, 609, 811, 340, 412, 699, 696, 208, 495, 353};
        
        ArrayList<Integer> response = findTriplet(arr, arr.length);

        System.out.println("\n\t Response "+response);
        
    }
    public static ArrayList<Integer> findTriplet(int arr[], int n){
        // your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int sum=0;
        int k_val=0;

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){
                
                sum=arr[i]+arr[j];

                for(int k=0; k<n; k++){
                    
                  if(k!=j && k!=i){
                     k_val=arr[k];        
                  }
                  if(k_val==sum){
                    
                      al.add(k_val);
                      al.add(arr[i]);
                      al.add(arr[j]);
                      //return al;
                  }
                }
            }
        }
        return al;
    }
}

//System.out.println("\n\t Before if block k : "+k+" k_val : "+k_val+" i :"+i+" j : "+j+" k : "+k);
 //System.out.println("\n\t inside if block k : "+k+" k_val : "+k_val+" i :"+i+" j : "+j+" k : "+k); 
 //System.out.println("\n\t if block k_val : "+k_val+" Sum : "+sum+" i :"+i+" j : "+j+" k : "+k);