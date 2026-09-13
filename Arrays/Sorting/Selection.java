import java.util.Arrays;
class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {2,5,6,3,8,1,9,22,12};
		selection(arr);
		System.out.print(Arrays.toString(arr));
	}

	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-i-1;
			int max=maxnum(arr,0,last);
			swap(arr,max,last);
		}
	}

	static void swap(int[] arr, int max, int last) {
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;
	}
	static int maxnum(int[] arr, int first, int last) {
		int max=first;
		for(int i=first;i<=last;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}
}