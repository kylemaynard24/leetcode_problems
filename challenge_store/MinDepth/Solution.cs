/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 /*
    Calculate the Minimum Depth of the tree
 */

  public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class Solution {
    public static int MinDepth(TreeNode root) {
        return -1;        
    }

    static void Main(string[] args){
        System.Console.WriteLine("Hello World");
        TreeNode testOne = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));


        System.Console.WriteLine(MinDepth(testOne)); // 2
    }
}