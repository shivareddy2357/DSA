class Solution {
    private int count;

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (Math.min(left, right) == -1) {
            this.count++;
            return 1;
        }
        
        if (Math.max(left, right) == 1) {
            return 0;
        }
        
        return -1;
    }

    public int minCameraCover(TreeNode root) {
        this.count = 0;
        int x = dfs(root);
        return (x == -1) ? this.count + 1 : this.count;
    }
}