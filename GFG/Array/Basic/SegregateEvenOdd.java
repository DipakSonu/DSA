import java.util.Arrays;

class SegregateEvenOdd {
    
    public static void main(String[] args) {
        
       //int arr[] = {12, 34, 45, 9, 8, 90, 3,4};
       int arr[] = {656,660,126,704,225,862,522,617,630,725,17,847,715,732,502,
        778,304,32,168,841,288,76,31,934,245,626,419,782,875,723,46,335,992,70};
       //int arr[] = {2,4,1,6,3,8,7};
       //int arr[] ={3,8,12,5};
       //int arr[] = {3,5,8,12};
       //int arr[] = {9,7,25,8};

       segregateEvenOdd(arr, arr.length);
    }

    public static void segregateEvenOdd(int arr[], int n) {
        
        int left=0;
        int right=(n-1);
        int leftVal=0;
        int rightVal=0;
        int evenCount=0;
        int oddCount=0;

        while(left<right){
            
            leftVal=arr[left];
            rightVal=arr[right];

            if(leftVal%2==0 && rightVal%2!=0){ //(even||odd)
               left++;
               right--;
               evenCount++;
               oddCount++;
               
            }
            else if(leftVal%2!=0 && rightVal%2!=0){ //(odd||odd)
                right--;
                oddCount++;
                
            }
            else if(leftVal%2==0 && rightVal%2==0){ //(even|| even)
                left++;
                evenCount++;
                
            }
           
            else if(leftVal%2!=0 && rightVal%2==0){ //(odd||even)
    
                arr[left]=rightVal;
                arr[right]=leftVal;
                evenCount++;
                oddCount++;
                left++;
                //right--; 
            }       
        }
        Arrays.sort(arr,0,evenCount);
        Arrays.sort(arr,evenCount,n);

        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
       
    }
}
