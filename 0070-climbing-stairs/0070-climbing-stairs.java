// class Solution {
//     public int climbStairs(int n) {
//         return solve(n);
//     }
//     public int solve(int n) {
//         if(n==1 || n==2) {
//             return n;
//         }
//         else {
//             return solve(n-1) + solve(n-2);
//         }

//     }
// }

// the above code give time limit exceed...

class Solution {
    public int climbStairs(int n){
        return solve(n);
    }
    public int solve(int n) {
        if(n==1 || n==2) {
            return n;
        }
        int p1 = 1;
        int p2 = 2;
        int c = 0;
        for(int i = 3;i <= n;i++) {
            c = p1+p2;
            p1 = p2;
            p2 = c;
        }
        return p2;
    }
}