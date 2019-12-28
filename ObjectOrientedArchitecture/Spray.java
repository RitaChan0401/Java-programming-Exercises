
public class Spray implements Node{
	private Node left;
	private Node right;
	private String name;
	
	public Spray(String name){
		this.name = name;
	}
	public void setLeft(Node node){
		this.left = node;
	}
	public void setRight(Node node){
		this.right = node;
	}
	public Node getLeft(){
		return this.left;
	}
	public Node getRight(){
		return this.right;
	}
	public String getName(){
		return this.name;
	}
}
