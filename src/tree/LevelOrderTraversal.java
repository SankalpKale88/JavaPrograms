package tree;

public class LevelOrderTraversal {
	
	public static void main(String[] args) throws Exception {
		BinaryTreeNode root = new BinaryTreeNode();
		BinaryTreeNode l1 = new BinaryTreeNode();
		BinaryTreeNode r1 = new BinaryTreeNode();
		BinaryTreeNode l2 = new BinaryTreeNode();
		BinaryTreeNode r2 = new BinaryTreeNode();
		BinaryTreeNode l3 = new BinaryTreeNode();
		BinaryTreeNode r3 = new BinaryTreeNode();
		
		r3.setData(7);
		l3.setData(6);
		r2.setData(5);
		l2.setData(4);
		r1.setData(3);
		l1.setData(2);
		root.setData(1);
		root.setLeft(l1);
		root.setRight(r1);
		l1.setLeft(l2);
		l1.setRight(r2);
		r1.setLeft(l3);
		r1.setRight(r3);
		
		LevelOrderTraversal l = new LevelOrderTraversal();
		l.LevelOrder(root);
	}
	
	private void LevelOrder(BinaryTreeNode root) throws Exception{
		BinaryTreeNode temp;
		LLQueue Q = LLQueue.createQueue();
		
		if(root == null){
			return;
		}
		Q.enQueue(root);
		while(!Q.isEmpty()){
			temp = Q.deQueue();
			System.out.print(temp.getData());
			if(temp.getLeft() != null){
				Q.enQueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				Q.enQueue(temp.getRight());
			}
		}
		
	}
}
