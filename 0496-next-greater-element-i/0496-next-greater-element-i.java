class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        // Iterate through each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            boolean found = false;
            
            // Find the index of num1 in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num1) {
                    // Check the elements to the right of nums2[j] for the next greater element
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > num1) {
                            result[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    // If no greater element is found, set result to -1
                    if (!found) {
                        result[i] = -1;
                    }
                    break;
                }
            }
        }
        
        return result;
    }
}