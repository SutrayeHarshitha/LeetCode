
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++) {
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
// class Solution {
//     public int maxSubArray(int[] a) {
//         int sum = a[0];
//         int maxSum = a[0];
//         for(int i = 1;i < a.length;i++) {
//             if(sum>=0) {
//                 sum+=a[i];
//             }
//             else {
//                 sum=a[i];
//             }
//             if(sum > maxSum) {
//                 maxSum = sum;
//             }
//         }
//         return maxSum;
//     }
// }