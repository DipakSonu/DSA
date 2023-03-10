class TournamentMethodMinMax{
    
    public static void main(String[] args) {

    int[] nums = { 7, 2, 9, 3, 1, 6, 7, 8, 4};
 
        // initialize the minimum element by INFINITY and the
        // maximum element by -INFINITY
        Pair p = new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
        findMinAndMax(nums, 0, nums.length - 1, p);
 
        System.out.println("The minimum array element is " + p.min);
        System.out.println("The maximum array element is " + p.max);
    
    }

    public static void findMinAndMax(int[] nums, int left, int right, Pair p)
    {
        // if the array contains only one element
 
        if (left == right)                  // common comparison
        {
            if (p.max < nums[left]) {          // comparison 1
                p.max = nums[left];
            }
 
            if (p.min > nums[right]) {         // comparison 2
                p.min = nums[right];
            }
 
            return;
        }
 
        // if the array contains only two elements
 
        if (right - left == 1)              // common comparison
        {
            if (nums[left] < nums[right])         // comparison 1
            {
                if (p.min > nums[left]) {      // comparison 2
                    p.min = nums[left];
                }
 
                if (p.max < nums[right]) {     // comparison 3
                    p.max = nums[right];
                }
            }
            else {
                if (p.min > nums[right]) {     // comparison 2
                    p.min = nums[right];
                }
 
                if (p.max < nums[left]) {      // comparison 3
                    p.max = nums[left];
                }
            }
 
            return;
        }
 
        // find the middle element
        int mid = (left + right) / 2;
 
        // recur for the left subarray
        findMinAndMax(nums, left, mid, p);
 
        // recur for the right subarray
        findMinAndMax(nums, mid + 1, right, p);
    }
}

class Pair{
    int min;
    int max;

    public Pair(int max, int min){
      this.max = max;
      this.min = min;
    }  
}
