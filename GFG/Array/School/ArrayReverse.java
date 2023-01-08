class ArrayReverse{

    static int arr[] = {1,2,3,4,5,6,7,8,9,10};
    static int lowIndex=0;
    static int highIndex=arr.length-1;
    static int lowValue;
    static int highValue;

    public static void main(String[] args) {
      rotateArray();
    }

    public static void rotateArray(){
      reverseArray();
    }

    public static void reverseArray(){

       while(lowIndex<highIndex){

         lowValue = arr[lowIndex];
         highValue = arr[highIndex];

         arr[lowIndex]=highValue;
         arr[highIndex]=lowValue;

         lowIndex+=1;
         highIndex-=1;

         for(int i=0; i<arr.length;i++){
            System.out.print(" "+arr[i]);
   			 }
   			 System.out.print("\n");
     }
   }
}
