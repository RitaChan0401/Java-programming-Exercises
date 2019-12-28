package Algorithm;

public class D6_2 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode("x");
        TreeNode t2 = new TreeNode("+");
        TreeNode t3 = new TreeNode("a");
        TreeNode t4 = new TreeNode("b");
        TreeNode t5 = new TreeNode("-");
        TreeNode t6 = new TreeNode("c");
        TreeNode t7 = new TreeNode("d");
        //
        t1.setLeft(t2);
        t1.setRight(t5);
        t2.setLeft(t3);
        t2.setRight(t4);
        t5.setLeft(t6);
        t5.setRight(t7);
        //
        t1.traversePreorder();
        System.out.println();
        t1.traverseInorder();
        System.out.println();
        t1.traversePostorder();
        System.out.println();
    }
}

