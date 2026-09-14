import java.util.Arrays;

class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,4,1};
		bubble(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void bubble(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			boolean value=true;
			
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					value=false;
				}
			}
			if(value)
			{
				break;
			}
		}
	}
}
