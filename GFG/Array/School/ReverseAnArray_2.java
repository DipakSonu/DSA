class ReverseAnArray_2{

	static void reverse(int a[],int n){

		int secondArray[] = new int[n];

		int j=n;

		//System.out.println("\n\t "+j);

		for(int i=0;i<n;i++){

			secondArray[j-1] = a[i];

			     //System.out.print("\n\t secondArray["+(j-1)+"]==>>>"+a[i]);
           j=j-1;
           //System.out.println ("\n\t ");
					 //System.out.print(" "+secondArray[j-1]);
					 //j=j-1;
		}

		for(int k=0; k<n; k++){
           System.out.print(" "+secondArray[k]);
		}
	}

	public static void main(String[] args) {

		int [] firstArray = {10,20,30,40,50,60,70};

		reverse(firstArray, firstArray.length);
	}
}
