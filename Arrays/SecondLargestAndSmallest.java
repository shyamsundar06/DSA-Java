class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] arr= {1,2,5,7,7,4};
		
		int largest=arr[0];
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest && arr[i]!=largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondlargest)
			{
				secondlargest=arr[i];
			}
		}
		
		int smallest=arr[0];
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest && arr[i]!=smallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest && arr[i]<secondsmallest)
			{
				secondsmallest=arr[i];
			}
		}
		
		System.out.println(secondlargest);
		System.out.print(secondsmallest);
}
}
