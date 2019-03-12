package searching;

public class BinarySearch {
 public static void main(String[] args) {
	 int array[] = new int[]{1,2,3,4,5,6,6,7};
	 BinarySearch b = new BinarySearch();
	 int d = b.BinarySearchIterative(array,array.length, 5);
	 System.out.println("Number found"+ d);
	 int d1 = b.BinarySerachRecursive(array, 0, array.length-1, 5);
	 System.out.println("Number found"+d1);
}

public int BinarySearchIterative(int a[],int n , int data){
	int low=0,high=n-1,mid;
	while(low <= high){
		mid=low+(high-low)/2;
		System.out.println("mid"+mid);
		if(a[mid]==data){
			return a[mid];
		}else if(a[mid] < data){
			low = mid+1;
		}else{
			high=mid-1;
		}
	}
	return -1;
}

public int BinarySerachRecursive(int a[],int low , int high, int data){
	int mid=low+ (high-low)/2;
	//System.out.println("mid="+mid);
	if(a[mid]==data){
		return a[mid];
	}
	else if(a[mid]<data){
		return BinarySerachRecursive(a, mid+1, high, data);
	}else{
		return BinarySerachRecursive(a, low, mid-1, data);
	}
}
}