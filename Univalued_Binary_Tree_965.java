package DSA.HackWithInfy.Binary_Tree;



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

public class Univalued_Binary_Tree_965 {

    
    public boolean isUnivalTree(TreeNode root) {
        
        return helper(root , root.val);
    }
    public boolean helper(TreeNode root , int val){
        if(root == null) return true ; 
        if(root.val != val) return false ; 

        return helper(root.left , root.val) && helper(root.right , root.val);
    }
}
