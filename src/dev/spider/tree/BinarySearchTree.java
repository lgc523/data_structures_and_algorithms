package dev.spider.tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        find(5);
    }

    public static void find(int val) {
        TreeNode p = PrintTree.initTree();
        while (p != null) {
            if (val < p.data) {
                p = p.left;
            } else if (val > p.data) {
                p = p.right;
            } else {
                System.out.println(p.data);
                return;
            }
        }
        System.out.println(val + " absent");
    }
}
