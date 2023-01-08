class DisplayLongestString{
    public static void main(String[] args) {
        String arr[] = {"Geek", "Geeks","GeeksforGeeks", "Geeksfor","GeeksforGeek","IamtheSunflower"};
        int n = arr.length;
        System.out.println("\n\t"+findTotalumberOfCharacter(arr,n));
    }

    public static String findTotalumberOfCharacter(String[] arr, int n){
      
      int[] strLength = new int[n];
      int largestNumber=Integer.MIN_VALUE;
      int index=0;
       for(int i=0; i<arr.length;i++){

           int strLth=arr[i].length();
           strLength[i]=strLth;
           
       }
       for(int j=0;j<strLength.length;j++){
          if(strLength[j]>largestNumber){
            largestNumber=strLength[j];
            index=j;
          }
       }
       //System.out.println("\n\t "+arr[index]);
       return arr[index];
    }
}