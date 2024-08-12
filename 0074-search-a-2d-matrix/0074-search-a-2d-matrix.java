class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r,c,temp,mid;
        int m =matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n-1;
        while(left <= right) {
            mid = (left+right)/2;
            r = mid/n;
            c = mid%n;
            temp = matrix[r][c];
            if(target == temp) return true;
            else if(target > temp) left = mid+1;
            else right = mid-1;
        }
    return false;
    }
}