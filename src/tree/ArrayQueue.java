package tree;

public class ArrayQueue {

	private int front;
	private int rear;
	private int capacity;
	private BinaryTreeNode [] array;
	
	private ArrayQueue(int size){
		capacity=size;
		front = -1;
		rear= -1;
		array= new BinaryTreeNode[size];
	}
	
	public static ArrayQueue createQueue(int size){
		return new ArrayQueue(size);
	}
	
	public boolean isEmpty(){
		return (front==-1);
	}
	
	public boolean isFull(){
		return ((rear+1)%capacity==front);
	}
	
	public int getQueueSize(){
		return((capacity-front+rear+1)%capacity);
	}
	
	public void enQueue(BinaryTreeNode node) throws Exception{
		if(isFull()){
			throw new Exception();
		}else{
			rear++;
			array[rear]=node;
			if(front == -1){
				front=rear;
			}
			System.out.println("Front"+front);
		}
	}
	
	public BinaryTreeNode deQueue() throws Exception{
		BinaryTreeNode node  = null;
		if(isEmpty()){
			throw new Exception();
		}else{
			node = array[front];
			if(front==rear){
				front = rear-1;
			}else{
				front++;
			}
			System.out.println("Front"+front);
		}
		return node;
	}
}	

