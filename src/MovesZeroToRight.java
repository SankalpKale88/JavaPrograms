
public class MovesZeroToRight {
	public static void main(String[] args)
	 {
	  int[] arr =
	  { 0, 5, 0, 2, 3, 0, 3, 5, 0 };
	  moveZeroesToRight(arr);
	  for (int num : arr)
	   System.out.print(num + ", ");
	  System.out.println();
	 }

	 private static void moveZeroesToRight(int[] arr)
	 {
	  int start = 0;
	  int end = arr.length - 1;
	  while (start < end)
	  {
	   if (arr[start] == 0 && arr[end] != 0)
	   {
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    start++;
	    end--;
	   } else
	   {
	    if (arr[start] != 0)
	     start++;
	    if (arr[end] == 0)
	     end--;
	   }
	  }
	 }

}
