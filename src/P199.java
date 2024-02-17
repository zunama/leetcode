import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P199 {
    public static void main(String[] args) {


        TreeNode f = new TreeNode(4);

        TreeNode d = new TreeNode(5, f, null);
        TreeNode e = new TreeNode(6);

        TreeNode b = new TreeNode(2, null, d);
        TreeNode c = new TreeNode(3, e, null);

        TreeNode a = new TreeNode(1, b, c);


        List<Integer> nums = rightSideView(a);
        for(int i : nums)
            System.out.println(i);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Queue<TreeNode> curr = new LinkedList<>();
        curr.add(root);

        while(!curr.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<>();
            TreeNode n = curr.remove();
            nums.add(n.val);

            if(n.right != null) next.add(n.right);
            if(n.left != null) next.add(n.left);

            while(!curr.isEmpty()) {
                n = curr.remove();

                if(n.right != null) next.add(n.right);
                if(n.left != null) next.add(n.left);
            }

            curr = next;
        }

        return nums;

    }
}
