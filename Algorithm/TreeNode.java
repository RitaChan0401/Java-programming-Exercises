package Algorithm;

public class TreeNode {
    private Object data;
    private TreeNode left = null;
    private TreeNode right = null;

    public TreeNode (String data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void traversePreorder(){
        System.out.print(this.data);
        if(this.left != null){
            this.left.traversePreorder();
        }
        if (this.right != null){
            this.right.traversePreorder();
        }
    }

    public void traverseInorder(){
        if (this.left != null){
            this.right.traverseInorder();
        }
        System.out.print(this.data);
        if(this.right != null){
            this.right.traverseInorder();
        }
    }

    public void traversePostorder(){
        if(this.left != null){
            this.left.traversePreorder();
        }
        if(this.right != null){
            this.right.traversePreorder();
        }
        System.out.print(this.data);
    }

}
