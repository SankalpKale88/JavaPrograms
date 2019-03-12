package tree;

public class PostOrderNonRecursiveTraverse {
	
	public static void main(String[] args) {
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
		PostOrderNonRecursiveTraverse p = new PostOrderNonRecursiveTraverse();
		System.out.println("Traversing of node is");
		p.inOrderTrave(root);
		System.out.println("");
		new PostOrderNonRecursiveTraverse().postRecOrder(root);
		System.out.println();
		//p.postOrder(root);
		System.out.println();
		p.postOrderRec(root);
	}
	
	private void inOrderTrave(BinaryTreeNode root){
		if(root != null){
			inOrderTrave(root.getLeft());
			System.out.print(root.getData());
			inOrderTrave(root.getRight());
		}
	}
	private void postRecOrder(BinaryTreeNode root){
		if(root != null){
			postRecOrder(root.getLeft());
			postRecOrder(root.getRight());
			System.out.print(root.getData());
		}
	}
	private void postOrder(BinaryTreeNode root){
		LLStack S = new LLStack();
		while(true){
			if(root != null){
				S.push(root);
				root = root.getLeft();
			}else{
				if(S.isEmpty()){
					break;
				}else{
					if(S.top().getRight() == null){
						root = S.pop();
						System.out.print(root.getData());
						if(root == S.top().getRight()){
							System.out.print(S.top().getData());
							S.pop();
						}
					}
					if(!S.isEmpty()){
						root = S.top().getRight();
					}else{
						root = null;
					}
				}
				
			}
			
			
			root = S.pop();
			root = root.getRight();
			if(root != null){
				System.out.print(root.getData());
			}
		}
		
	}
	
	private void postOrderRec(BinaryTreeNode root){
		LLStack S = new LLStack();
		while(true){
			while(root != null){
				if(root.getRight() != null){
					S.push(root.getRight());
				}
				S.push(root);
				root = root.getLeft();
			}
			
			root  = S.pop();
			
			if(root.getRight() != null && S.top() == root.getRight()){
				S.pop();
				S.push(root);
				root = root.getRight();
			}else{
				System.out.print(root.getData());
				root = null;
			}
			if(S.isEmpty()){
				break;
			}
		}
		
	}

}
