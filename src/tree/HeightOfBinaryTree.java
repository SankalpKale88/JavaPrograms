package tree;

public class HeightOfBinaryTree {

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
		
		HeightOfBinaryTree h = new HeightOfBinaryTree();
		int height = h.FindHeightofBinaryTree(root);
		System.out.println("Height of Binary tree is "+height);
	
		System.out.println("Binary Tree");
		int h1 = h.FindHeightOfBinaryTreeWR(root);
		System.out.println("Hi"+h1);
		
	}
	
	public int FindHeightofBinaryTree(BinaryTreeNode root){
		int leftHeight, rightHeight;
		if(root == null){
			return 0;
		}else{
			leftHeight = FindHeightofBinaryTree(root.getLeft());
			System.out.println("left"+leftHeight);
			rightHeight = FindHeightofBinaryTree(root.getRight());
			System.out.println("right"+rightHeight);
			if(leftHeight > rightHeight){
				System.out.println("LEFT");
				return (leftHeight+1);
			}else{
				System.out.println("RIGHT");
				return rightHeight+1;
			}
		}
	}
	
	public int FindHeightOfBinaryTreeWR(BinaryTreeNode root) throws Exception{
		System.out.println("Inside Fu");
		//BinaryTreeNode b1 = new BinaryTreeNode();
		LLQueue Q = LLQueue.createQueue();
		int level = 1;
		if(root == null){
			return 0;
		}
		Q.enQueue(root);
		System.out.println("enq");
		Q.enQueue(null);
		while(!Q.isEmpty()){
			root = Q.deQueue();
			if(root == null){
				if(!Q.isEmpty()){
					Q.enQueue(null);
				}
				level++;
			}else{
				if(root.getLeft() != null){
					Q.enQueue(root.getLeft());
				}
				if(root.getRight() != null){
					Q.enQueue(root.getRight());
				}
			}
		}
		return level;
	}
}
