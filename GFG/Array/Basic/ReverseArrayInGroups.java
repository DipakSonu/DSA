import java.util.ArrayList;
class ReverseArrayInGroups{
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(36);             
        al.add(93); 
        al.add(64);
        al.add(48);
        al.add(96);
        al.add(55);
        al.add(70);
        al.add(0);
        al.add(82);
        al.add(30);
        //al.add(16);
        /*al.add(22); 
        al.add(38); 
        al.add(53); 
        al.add(19); 
        al.add(50); 
        al.add(91); 
        al.add(43);    
        al.add(70);  
        al.add(88); 
        al.add(10); 
        al.add(57);                        
        al.add(14);
        al.add(94);
        al.add(13);
        al.add(36);
        al.add(59);
        al.add(32);
        al.add(54);
        al.add(58);
        al.add(18); 
        al.add(82);
        al.add(67);*/
        
        reverseInGroups(al, al.size(),3);
    }

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int reminder=n%k;
        int startIndex=0; 
        int endIndex=(k-1);
        int step=n/k;

        if(k<n && reminder==0){

            
            for(int i=0;i<step;i++){

                rightReversalRotaion(arr,startIndex, endIndex);
                
                startIndex=startIndex+k;
                endIndex=endIndex+k;
            } 
        }
        else if(k<n && reminder!=0){
            
            for(int i=0;i<step;i++){

                rightReversalRotaion(arr,startIndex, endIndex);
                
                startIndex=startIndex+k;
                endIndex=endIndex+k;
            } 

            rightReversalRotaion(arr,(n-reminder), (n-reminder));
            
        }
        else{
            rightReversalRotaion(arr,0, (n-1));
         
            rightReversalRotaion(arr, k, (n-1));
        }
        
        for(int i=0; i<n; i++){
            System.out.print(" "+arr.get(i));
        }
        System.out.println("\n\n");

    }

    public static ArrayList<Integer> rightReversalRotaion(ArrayList<Integer> arr, int startIndex, int endIndex){
         
        int lowIndex=startIndex;
        int highIndex=endIndex;
    

        while(lowIndex<highIndex){

            int lowIndexVal=arr.get(lowIndex);
            int highIndexVal=arr.get(highIndex);
            
            lowIndexVal=arr.set(lowIndex,highIndexVal);
            highIndexVal=arr.set(highIndex,lowIndexVal);
            arr.add(lowIndexVal);
            arr.add(highIndexVal);

            lowIndex++;
            highIndex--;
        }
        return arr;
    }
} 