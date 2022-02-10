package dev.spider.tree;

import java.util.*;

public class PrintTree {
    /**
     * O(N)
     */
    public static void main(String[] args) {
        TreeNode root = initTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        layerOrder(root);
        layerOrder1(root);
    }

    public static TreeNode initTree() {
        TreeNode r = new TreeNode(1);
        TreeNode t0 = new TreeNode(8);
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(5);
        r.setLeft(t0);
        r.setRight(t1);
        t0.setLeft(t2);
        t0.setRight(t3);
        t1.setLeft(t4);
        t1.setRight(t5);
        return r;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void layerOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> layer = new ArrayList<>();
            int currentLayerSize = queue.size();
            for (int i = 1; i <= currentLayerSize; ++i) {
                TreeNode node = queue.poll();
                layer.add(node.data);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(layer);
        }
        System.out.println(Arrays.toString(ret.toArray()));
    }

    public static void layerOrder1(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return;
        }
        //2.
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.data);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        System.out.println(Arrays.toString(lists.toArray()));
    }
}
