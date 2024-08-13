class Solution 
{
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[3]; 
       
        for (int i = 0; i < n; i++) 
        {
            int element = nums[i];
            arr[element]++;
        }
        int j = 0;
        for (int element = 0; element < 3; element++) 
        {
            while (arr[element] > 0) 
            {
                nums[j] = element;
                j++;
                arr[element]--;
            }
        }
    }
}