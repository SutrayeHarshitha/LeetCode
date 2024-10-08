class Solution {
    public int findDuplicate(int[] a) {
        int duplicate,temp;
        while(true) {
            if(a[a[0]]!= a[0]) {
                temp = a[a[0]];
                a[a[0]] = a[0];
                a[0] = temp;
            }
            else {
                duplicate = a[0];
                break;
            }
        }
        return duplicate;
    }
}