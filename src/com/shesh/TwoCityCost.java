package com.shesh;

public class TwoCityCost {


    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(130);
        TreeNode t5 = new TreeNode(110);
        TreeNode t6 = new TreeNode(60);
        TreeNode t7 = new TreeNode(70);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

//        TreeNode.display(t1, 0,new StringBuilder(""));



    }
}


class TreeNode {

    int value;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int val) {
        this.value = val;
    }

    TreeNode() {

    }

    public TreeNode creatNode(int x) {

        return new TreeNode(x);
    }

    static void display(TreeNode t, int tab, StringBuilder s) {

        if (t == null) {
            System.out.println();
            return;
        }
        for (int i = 0; i <= tab; i++) {
            s.append("\t");
        }
        display(t.left, tab += 1, s);
        System.out.print(  t.value +" "+s.toString() );
        display(t.right, tab += 1, s);
    }

}



