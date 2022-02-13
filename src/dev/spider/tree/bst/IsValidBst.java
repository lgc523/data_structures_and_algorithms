package dev.spider.tree.bst;

import dev.spider.tree.PrintTree;
import dev.spider.tree.TreeNode;

public class IsValidBst {
    public static void main(String[] args) {
        TreeNode treeNode = PrintTree.initTree();
        PrintTree.preOrder(treeNode);
        System.out.println();
        isBst(treeNode);
    }

    public static void isBst(TreeNode root) {
        if (root == null) {
            System.out.println(true);
            return;
        }
        TreeNode left = root.getLeft();
        TreeNode right = root.getRight();

        if (left != null && left.getData() > root.getData()) {
            System.out.println(false);
            return;
        }
        if (right != null && right.getData() < root.getData()) {
            System.out.println(false);
            return;
        }
        isBst(root.getLeft());
        isBst(root.getRight());
    }
}
