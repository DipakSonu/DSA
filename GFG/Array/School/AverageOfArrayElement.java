class AverageOfArrayElement{

	public static void main(String[] args) {

		int intArr[] = {1,2,3,4,5,6,7,8,9,10};

		int arrLength = intArr.length;

		float a = 0f;

		for(int i=0; i<intArr.length; i++){

				a=a+intArr[i];
    }

		System.out.println("\n\t Average of an Array : "+a/intArr.length);

	}
}
