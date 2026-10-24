class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int[] f = new int[n];
        f[0] = 1;
        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] * i;
            nums.add(i);
        }
        nums.add(n);
        
        StringBuilder sb = new StringBuilder();
        for (k--; n > 0; n--) {
            int i = k / f[n - 1];
            sb.append(nums.remove(i));
            k %= f[n - 1];
        }
        return sb.toString();
    }
}
