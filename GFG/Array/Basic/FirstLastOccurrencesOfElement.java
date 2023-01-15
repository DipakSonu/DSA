import java.util.ArrayList;

class FirstLastOccurrencesOfElement{

    public static void main(String[] args) {

        int[] arr={1,3,5,5,5};
        //int[] arr = {0,0 ,0 ,0 ,1 ,1 ,1 ,1,5};
        //int[] arr={5};
        
        ArrayList<Integer> response=firstAndLast(arr,arr.length,5);
        
        for (Integer integer : response) {
            System.out.println("\n\t "+integer);
        }
        
    }
    
    public static ArrayList<Integer> firstAndLast(int[] arr, int n, int x){

        ArrayList<Integer> al = new ArrayList<>();
        int bigBuddy=Integer.MIN_VALUE;
        int smallBuddy=Integer.MAX_VALUE;

        for(int i=0;i<n; i++){

            if(arr[i]==x){
              if(bigBuddy<i){
                bigBuddy=i;
                System.out.println("\n\t Big Buddy : "+bigBuddy); 
              }
              if(smallBuddy>i){
                smallBuddy=i;
                System.out.println("\n\t Small Buddy : "+smallBuddy); 
              }
            }   
        }
        if(smallBuddy!=Integer.MAX_VALUE && bigBuddy!=Integer.MIN_VALUE){
            al.add(smallBuddy);
            al.add(bigBuddy);
            return al;
        }
        else{
            al.add(-1);
            return al;
        }
    }
} 