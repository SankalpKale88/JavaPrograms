package tree;

public class LLQueue {
	
	private LLNode frontNode;
	private LLNode rearNode;
	
	private LLQueue(){
		this.frontNode=null;
		this.rearNode=null;
	}
	
	public static LLQueue createQueue(){
		return new LLQueue();
	}
	
	public boolean isEmpty(){
		return (frontNode == null);
	}
	
	public void enQueue(BinaryTreeNode treeNode){
		LLNode newNode = new LLNode(treeNode);
		if(rearNode!=null){
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		if(frontNode == null){
			frontNode= rearNode;
		}
	}
	
	public BinaryTreeNode deQueue() throws Exception{
		BinaryTreeNode treeNode=null;
		if(isEmpty()){
			throw new Exception();
		}else{
			treeNode=frontNode.getTreeNode();
			frontNode=frontNode.getNext();
		}
		return treeNode;	}
	
}
