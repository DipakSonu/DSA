import java.util.Arrays;

class HowManyPizzas{

    public static void main(String[] args) {
        
        /*int[] stack1 = {891, 424, 945, 741, 897, 514, 692, 221, 678, 168};
        int[] stack2 = {702, 952, 221, 614, 69, 753, 821, 971, 318, 364};*/

        int[] stack1 = {2, 7 ,1 ,15 ,15 ,9 ,6 ,14, 15, 10};
        int[] stack2 = {1, 6, 14, 15, 15, 15, 7 ,9 ,2 ,10};

        System.out.println("\n\t Response : "+getCommon(stack1, stack2));
    }

    public static int getCommon(int stack1[], int stack2[]) {
        // Write your code here
        int count=0;
        Arrays.sort(stack1);
        Arrays.sort(stack2);

        for(int i=0; i<10; i++){

            for(int j=0; j<10; j++){
               if(stack1[i]==stack2[j]){
                  System.out.println("\n\t stack1["+i+"] "+stack1[i]+" stack2["+j+"] "+stack2[j]);
                  count++;
               }
            }
        }
        return count;
    }

}
/*
 * 2 7 1 15 15 9 6 14 15 10
   1 6 14 15 15 15 7 9 2 10
 */