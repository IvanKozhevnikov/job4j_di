package ru.job4j.di.model;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //  1
        // 2 3
        TreeNode t1 = new TreeNode(1)
                .setLeft(new TreeNode(2))
                .setRight(new TreeNode(3));
        TreeNode t2 = new TreeNode(1)
                .setLeft(new TreeNode(2))
                .setRight(new TreeNode(3));
        System.out.println("t1.equals(t2) " + t1.equals(t2));

        //    1
        //  2   3
        //4  - -  -
        TreeNode t3 = new TreeNode(1)
                .setLeft(new TreeNode(2).setLeft(new TreeNode(4)))
                .setRight(new TreeNode(3));
        TreeNode t4 = new TreeNode(1)
                .setLeft(new TreeNode(2).setLeft(new TreeNode(4)))
                .setRight(new TreeNode(3));
        System.out.println("t3.equals(t4) " + t3.equals(t4));
    }
}

class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode setValue(int value) {
        this.value = value;
        return this;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TreeNode treeNode = (TreeNode) o;
        return value == treeNode.value && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }
//    @Override
//    public boolean equals(Object o) {
//        // TODO - implement this
//
//        if(o.hashCode() == this.hashCode()) {
//            return true;
//        }
//        return false;
//
//        if(o.equals(this.value)) {
//            return true;
//        }
//    }
}
