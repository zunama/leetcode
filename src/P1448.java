import util.TreeNode;

public class P1448 {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(3, null, a);
        TreeNode c = new TreeNode(9, null, b);

        int count = goodNodes(c);
        System.out.println(count);
    }

    public static int goodNodes(TreeNode root) {
        int count = countGoodNodes(root, root.val);
        return count;
    }

    private static int countGoodNodes(TreeNode node, int max) {
        if(node == null) return 0;

        int leftCount = countGoodNodes(node.left, node.val);
        int rightCount = countGoodNodes(node.right, node.val);

        return leftCount + rightCount + (node.val >= max ? 1 : 0);
    }
}
