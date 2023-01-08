class AscendingOrderSoarting{

   public static void main(String[] args) {

        int[] arr = {11, 78, 7, 45 , 10, 3, 78, 9, 7, 9};
        int temp;

        for(int i=0; i<arr.length; i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        }
        for(int k=0; k<arr.length; k++){
          System.out.print("\t "+arr[k]);
          //if(arr[])
        }
   }
}
