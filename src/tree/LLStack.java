package tree;

public class LLStack {
	
	private LLNode head = null;
	
	public LLStack(){
	}
	public void push(BinaryTreeNode node){
		LLNode llNode = new LLNode(node);
		llNode.setNext(head);
		head = llNode;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	public BinaryTreeNode pop(){
		if(head == null){
			return null;
		}
		LLNode node = head;
		head = head.getNext();
		return node.getTreeNode();
	}
	public BinaryTreeNode top() {
	    if(head == null){
	    	return null;
	    }
		return head.getTreeNode();
	}
}
