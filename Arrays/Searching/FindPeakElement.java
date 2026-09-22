class FindpeakElement {

	public static void main(String[] args) {
		int[]arr= {2,3,5,6,5,4,3,2,1};
		System.out.print(findpeak(arr));
	}
	static int findpeak(int[] arr)
	{
		int st=0;
		int end=arr.length-1;
		
		while(st<end)
		{
			int mid=st+(end-st)/2;
			
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else
			{
				st=mid+1;
			}
		}
		return arr[end];
	}

}
