package dev.spider.tree.bst;

import dev.spider.tree.PrintTree;
import dev.spider.tree.TreeNode;

public class BstIncr {
    public static void main(String[] args) {
        TreeNode root = PrintTree.initTree();
        PrintTree.preOrder(root);
        System.out.println();
        incr1(root);
        PrintTree.preOrder(root);
    }

    public static void incr1(TreeNode root) {
        if (root == null) {
            return;
        }
        root.setData(root.getData() + 1);
        incr1(root.getLeft());
        incr1(root.getRight());
    }
}

