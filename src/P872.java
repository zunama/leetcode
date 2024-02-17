import util.TreeNode;

import java.util.ArrayList;

public class P872 {
    public static void main(String[] args) {

    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> root1Leaves = new ArrayList<>();
        ArrayList<Integer> root2Leaves = new ArrayList<>();

        getLeaves(root1, root1Leaves);
        getLeaves(root2, root2Leaves);

        if(root1Leaves.size() != root2Leaves.size()) return false;

        for (int i = 0; i < root1Leaves.size(); i++) {
            if(!root1Leaves.get(i).equals(root2Leaves.get(i)))
                return false;
        }

        return true;
    }

    public static void getLeaves(TreeNode node, ArrayList<Integer> leaves) {
        if(node.left == null && node.right == null) {
            leaves.add(node.val);
        }

        if(node.left != null) {
            getLeaves(node.left, leaves);
        }

        if(node.right != null) {
            getLeaves(node.right, leaves);
        }
    }
}
