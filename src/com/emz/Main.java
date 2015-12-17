package com.emz;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeNode node1 =new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right = node5;

        node2.left = node3;
        node2.right = node4;

        node5.right = node6;

        TreeFlattern tf=new TreeFlattern();

        tf.flatten(node1);

        tf.VisitNode(node1);

    }

    private void TestMaxSubArray(){
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};

        MaxSubArray msa=new MaxSubArray();

        System.out.println(msa.maxSubArray(array));
    }
}
