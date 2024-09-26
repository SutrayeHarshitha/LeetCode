class Solution {
    public void backtrack(int start, int[] candidates, int target, List<Integer> curr, List<List<Integer>> res){
        if(target == 0) {
            res.add(new ArrayList(curr));
        }
        if(target < 0) {
            return;
        }
        for(int i = start;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],curr,res);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0,candidates,target,curr,res);
        return res;
    }
}