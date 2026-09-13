import java.util.Arrays;
class InsertionSort {
	public static void main(String[]args)
	{
		int[] arr= {3,2,5,7,9,1,8,10};
		Insertion(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void Insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
	}
}