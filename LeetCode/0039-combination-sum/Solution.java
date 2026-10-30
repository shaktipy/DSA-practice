class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }
    void solve(int[] candidates, int target, int index,
               List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        if (index == candidates.length) {
            return;
        }
        // Pick: same element dobara use kar sakte hain
        list.add(candidates[index]);
        solve(candidates, target - candidates[index], index, list, ans);
        // Backtrack: element remove karo
        list.remove(list.size() - 1);
        // Not pick: next element par jao
        solve(candidates, target, index + 1, list, ans);
    }
}