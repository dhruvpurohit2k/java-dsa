class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombinations(candidates,target,0,new ArrayList<>(),0,res);
        return res;
    }
    private void makeCombinations(int[] candidates, int target, int i, List<Integer> comb, int total , List<List<Integer>> res){
        if(target == total){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || i >= candidates.length) return;
        comb.add(candidates[i]);
        makeCombinations(candidates,target,i,comb,total+candidates[i],res);
        comb.remove(comb.size()-1);
        makeCombinations(candidates,target,i+1,comb,total,res);
    }
}
