package Algorithm;

public class D6_1 {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode("a");
        TreeNode t2 = new TreeNode("b");
        TreeNode t3 = new TreeNode("c");
        TreeNode t4 = new TreeNode("d");
        //
        t1.setLeft(t2);
        t2.setLeft(t3);
        t1.setRight(t4);
        //
        t1.traversePreorder();
        System.out.println();
        t1.traverseInorder();
        System.out.println();
        t1.traversePostorder();
        System.out.println();
    }
}
