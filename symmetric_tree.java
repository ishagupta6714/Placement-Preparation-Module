class Solution {
    public boolean check(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null)
            return true;
        if(r1==null||r2==null)
            return false;
        if(r1.val==r2.val)
        {
           if(check(r1.left,r2.right)&&check(r1.right,r2.left))
               return true;
        }
        return false;
      
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        if(check(root.right,root.left))
            return true;
        return false;
    }
}
