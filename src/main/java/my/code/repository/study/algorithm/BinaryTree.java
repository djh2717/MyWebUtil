package my.code.repository.study.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * The type Binary tree.
 *
 * @author djh on  2018/12/4 14:10
 * @E-Mail 1544579459 @qq.com
 */
public class BinaryTree {

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        recursivePreOrder(root, list);
        return list;
    }

    private void recursivePreOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        recursivePreOrder(node.left, list);
        recursivePreOrder(node.right, list);
    }

    private void stackPreOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.push(node);
        while (!linkedList.isEmpty()) {

            TreeNode currentNode = linkedList.pop();
            System.out.println(currentNode.val);

            if (currentNode.right != null) {
                linkedList.push(currentNode.right);
            }

            if (currentNode.left != null) {
                linkedList.push(currentNode.left);
            }
        }
    }

    private void stackMiddleOrder(TreeNode node) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();

        while (node != null || !linkedList.isEmpty()) {
            while (node != null) {
                linkedList.push(node);
                node = node.left;
            }
            TreeNode currentNode = linkedList.pop();
            System.out.println(currentNode.val);
            node = currentNode.right;
        }
    }

    public static void postOrderStack(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        Map<TreeNode, Boolean> map = new HashMap<>(16);
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode temp = s.peek();
            if (temp.left != null && !map.containsKey(temp.left)) {
                temp = temp.left;
                while (temp != null) {
                    if (map.containsKey(temp)) {
                        break;
                    } else {
                        s.push(temp);
                    }
                    temp = temp.left;
                }
                continue;
            }
            if (temp.right != null && !map.containsKey(temp.right)) {
                s.push(temp.right);
                continue;
            }
            TreeNode t = s.pop();
            map.put(t, true);
            System.out.println(t.val);
        }
    }


}
