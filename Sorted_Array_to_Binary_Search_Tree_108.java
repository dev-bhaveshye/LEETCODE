package DSA.HackWithInfy.Binary_Search_Tree;

class Sorted_Array_to_Binary_Search_Tree_108{
    public TreeNode helper( int start , int end , int[] nums){
        if(start > end ){
            return null ;
        }
        int mid = (start + end )/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(start , mid-1,nums);
        root.right = helper(mid+1 , end , nums);

        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(0 , nums.length-1 , nums);
    }
}