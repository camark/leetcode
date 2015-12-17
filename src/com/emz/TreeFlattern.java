package com.emz;

import java.util.ArrayList;
import java.util.List;


public class TreeFlattern {
    List<Integer> nodes = new ArrayList<Integer>();

    public void flatten(TreeNode root) {
        PopulateNode(root);

        //for (int a : nodes)
        //System.out.println(a);

        //System.out.println("-------------");


        List<TreeNode> nodeArray = new ArrayList<TreeNode>();

        for (int i : nodes)
            nodeArray.add(new TreeNode(i));

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodeArray.get(i).right = nodeArray.get(i + 1);
            nodeArray.get(i).left = null;
        }

        //VisitNode(nodeArray.get(0));

        root.right = nodeArray.get(1);
        root.left = null;

    }

    public void PopulateNode(TreeNode node) {
        if (node == null)
            return;

        nodes.add(node.val);
        //System.out.println(node.val);
        PopulateNode(node.left);
        PopulateNode(node.right);
    }

    public void VisitNode(TreeNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }

        //nodes.add(node.val);
        System.out.println(node.val);
        VisitNode(node.left);
        VisitNode(node.right);
    }
}
