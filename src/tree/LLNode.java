package tree;

public class LLNode {
	
	private BinaryTreeNode treeNode;
	private LLNode next;
	
	
	public LLNode(BinaryTreeNode treeNode) {
		super();
		this.treeNode = treeNode;
	}
	/**
	 * @return the treeNode
	 */
	public BinaryTreeNode getTreeNode() {
		return treeNode;
	}
	/**
	 * @param treeNode the treeNode to set
	 */
	public void setTreeNode(BinaryTreeNode treeNode) {
		this.treeNode = treeNode;
	}
	/**
	 * @return the next
	 */
	public LLNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(LLNode next) {
		this.next = next;
	}
	
}
