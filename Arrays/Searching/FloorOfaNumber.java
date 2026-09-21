class CeilingNumber {
	public static void main(String[] args) {
		int []arr= {2,3,5,7,9,12,17,20,22};
		int target=10;
		System.out.print(Ceiling(arr,target));
	}
	static int Ceiling(int[]arr,int target)
	{
		//what if the target element is greater than the largest element in the array
		if(target>arr[arr.length-1])
		{
			return -1;
		}
		
		if(target<arr[0])// this condition is for floor of the number
		{
			return -1;
		}
		
		int st=0;
		int end=arr.length-1;
		
		while(st<=end)
		{
			int mid=st+(end-st)/2;
			
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				st=mid+1;
			}
			else
			{	
				return mid;
			}
		}
		return arr[end];
	}
}
