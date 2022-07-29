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
    public static bool IsSameTree(TreeNode p, TreeNode q) {
        return false;
    }

    static void Main(string[] args){
        System.Console.WriteLine("Hello World");
        TreeNode testOneA = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode testOneB = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.Console.WriteLine(IsSameTree(testOneA, testOneB)); // true

        TreeNode testTwoA = new TreeNode(1, new TreeNode(2), null);
        TreeNode testTwoB = new TreeNode(1, new TreeNode(2), null);
        System.Console.WriteLine(IsSameTree(testTwoA, testTwoB)); // true

        System.Console.WriteLine(IsSameTree(testOneA, testTwoB)); // false
    }
}