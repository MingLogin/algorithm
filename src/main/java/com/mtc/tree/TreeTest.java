package com.mtc.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class TreeTest {

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode node = createBinaryTree(inputList);
        System.out.println("=========前序遍历");
        preOrderTraveral(node);
        System.out.println("=========中序遍历");
        inOrderTraveral(node);
        System.out.println("=========后序遍历");
        postOrderTraveral(node);
        System.out.println("=========非递归    前序遍历");
        //preOrderTraveralWithStack(node);
        System.out.println(node);
    }

    //非递归前序遍历
//    private static void preOrderTraveralWithStack(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode treeNode = root;
//        while (treeNode !=null || !stack.isEmpty()){
//            //访问节点的左节点孩子 并入栈
//            while (treeNode !=null){
//                System.out.println(treeNode.data);
//                stack.push(treeNode.leftChild);
//                treeNode = treeNode.leftChild;
//            }
//            //如果没有左孩子 弹出栈顶元素  并且访问右孩子
//            if (!stack.isEmpty()){
//                stack.pop();
//                treeNode = treeNode.rightChild;
//            }
//        }
//    }
    //前序遍历  根节点   左节点  右节点
    private static void preOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.data);
        preOrderTraveral(treeNode.leftChild);
        preOrderTraveral(treeNode.rightChild);
    }

    //中序遍历  左节点 根节点 右节点
    private static void inOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrderTraveral(treeNode.leftChild);
        System.out.println(treeNode.data);
        inOrderTraveral(treeNode.rightChild);

    }

    //中序遍历  左节点  右节点 根节点
    private static void postOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTraveral(treeNode.leftChild);
        postOrderTraveral(treeNode.rightChild);
        System.out.println(treeNode.data);

    }

    //构建二叉树
    private static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.size() == 0) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }

    //二叉树节点
    private static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
