class ArrayRightRotation{

    public static void main(String[] args) {
    int[] arr ={1,2,3,4,5/*,6,7,8, 9,10*/};

        int[] ans=rotation(arr,1);
        for (int i : ans) {
            System.out.print("\t "+i);
        }
        //System.out.println("\n\t "+ans);
    }

    public static int[] rotation(int[] arr,int arrRotation){
         int arrLength=arr.length;
         int remRotation=arrRotation%arrLength;
         /*int arrRotation*/;
         int[] anotherArr=new int[arrLength];
         
         for(int i=0;i<arrLength;i++){
             //int nxtIndex=i+arrRotation;
             int nxtIndex=i+remRotation;
             //System.out.println("\n\t Next Index  : "+nxtIndex);
             if(nxtIndex<arrLength){
                //System.out.println("\n\t Inside if block : "+nxtIndex+" arr["+i+"] : "+arr[i]);
                 anotherArr[nxtIndex]=arr[i];
                 //System.out.println("\n\t Inside if block : "+nxtIndex+" arr["+i+"] : "+arr[i]+", +anotherArr["+nxtIndex+"] : "+anotherArr[nxtIndex]);
             }
             else if(nxtIndex>=arrLength){
                 int j=nxtIndex-arrLength;
                 //System.out.println("\n\t j "+j);
                 anotherArr[j]=arr[i];
                 //System.out.println("\n\t Inside else if block : "+nxtIndex+": j "+j+" arr["+i+"] : "+arr[i]);
                 //System.out.println("\n\t Inside if else block "+j+" arr["+i+"] : "+arr[i]+", +anotherArr["+j+"] : "+anotherArr[j]);
             }
             //System.out.println("\n\t "+anotherArr[i]);
             
        }

        return anotherArr;
    }
    
}