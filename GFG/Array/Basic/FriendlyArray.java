import java.util.*;
class FriendlyArray{

    public static void main(String[] args) {
        
        //long arr[] = {4,1,5};
        long arr[]={2,4,8,20,22,43};
        //long[] arr={3,4,7,11,18};
        //long[] arr= {30,23};

        long responseOne = sumOfMinAbsDifferencesOne(arr, arr.length);

        System.out.println("\n\t Response One : "+responseOne);

        long responseTwo = sumOfMinAbsDifferencesTwo(arr, arr.length);

        System.out.println("\n\t Response Two : "+responseTwo);
    }
    
    //Soltion for school lavel
    public static long sumOfMinAbsDifferences(long arr[] ,int N){

        long sum=0;
        
        for(int i=0; i<N; i++){
            
            long smallBuddy=Integer.MAX_VALUE;
            for(int j=0; j<N; j++){
               
                if( j!=i){
                    
                    long elementSum = Math.abs(arr[i]-arr[j]);

                    if(smallBuddy>elementSum){
                        smallBuddy=elementSum;
                    }
                }  
            }
            sum=sum+smallBuddy; 
        }

        return sum;
    }
    
    //It is a solution for beingner, which take a little time to get solution

    public static long sumOfMinAbsDifferencesOne(long arr[] ,int N){

        long sum=0;
        Arrays.sort(arr);
        
        for(int i=0; i<N; i++){
            
            long smallBuddy=Integer.MAX_VALUE;
            
            for(int j=0; j<N; j++){

               int indexGap=Math.abs(i-j);

                if( j!=i && indexGap==1){
                    
                    long elementSum = Math.abs(arr[i]-arr[j]);

                    if(smallBuddy>elementSum){
                        smallBuddy=elementSum;
                    }
                } 
            }
            sum=sum+smallBuddy; 
        }

        return sum;
    }
    
    //It is a professional solutio which is used in GFg

    public static long sumOfMinAbsDifferencesTwo(long arr[] ,int N){

        long sum=0;
         Arrays.sort(arr);
        for(int i=0; i<N; i++){

            int x=Math.abs(i-1);
            int y=Math.abs(i+1);
            int z=y<N?y:N-2;

            System.out.println("\n\t x : "+x+" y : "+y+" z : "+z);

            if(x<=(N-1) && z<N){
               
                long elementSumOne=Math.abs(arr[i]-arr[x]);
                long elementSumTwo=Math.abs(arr[i]-arr[z]);
                
                System.out.println("\n\t ElementSumOne : "+elementSumOne+" ElementSumTwo : "+elementSumTwo);

                if(elementSumOne>elementSumTwo){
                    sum=sum+elementSumTwo;
                    //System.out.println("\n\t if block Sum "+sum);
                }
                else if(elementSumTwo>elementSumOne){
                    sum=sum+elementSumOne;
                    //System.out.println("\n\t else if Sum "+sum);
                }
                else{
                    sum=sum+elementSumOne;
                    //System.out.println("\n\t else  Sum "+sum);
                }
            }
            
        }
        return sum;
    }  
}