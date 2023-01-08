import java.util.Scanner;

import javax.swing.text.PlainDocument;

class SwapArrayElement{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        //int[] a = {5, 3, 6, 1, 2};
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("\t Enter the swaping position ");
        int k= sc.nextInt();

        swapKth(a,n,k);
    }

    public static void swapKth(int[] a, int n, int k){

        int rI= k-1;
        int temp=0;
        int kth=n-k;

            temp = a[rI];
            a[rI] = a[kth];
            a[kth]=temp;
         
        //System.out.println("rI :--"+rI+",Kth--"+kth);   

         for(int i=0; i<n; i++){
             System.out.println("\t"+a[i]+"");
         }    

    }
}