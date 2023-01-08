public class ArraySwap_1{

    static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,21};
	static int lowIndex=0;
	static int highIndex=arr.length-1;


    public static void main(String[] args) {

	     swapArrayElement(lowIndex, highIndex);
	}

	public static void swapArrayElement(int lowIndex, int highIndex){

		while(lowIndex<highIndex){

			int lowVal = arr[lowIndex];
			int highVal = arr[highIndex];

			arr[lowIndex]=highVal;
			arr[highIndex]=lowVal;

			lowIndex=lowIndex+1;
			highIndex = highIndex-1;

     for(int i=0; i<arr.length;i++){

        System.out.print(" "+arr[i]);
			}
			 System.out.print("\n");
		}
	}

}
