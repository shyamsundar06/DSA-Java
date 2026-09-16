import java.util.Arrays;

class Practice {
    public static void main(String[] args) {
    	int[] arr= {2,1,4,5,3,10,7,9};
    	arr=mergesort(arr);
    	System.out.print(Arrays.toString(arr));
    }   
    
    public static int[] mergesort(int[] arr)
    {
    	if(arr.length==1)
    	{
    		return arr;
    	} 
    	
    	int mid=arr.length/2;
    	
    	int left[]=mergesort(Arrays.copyOfRange(arr, 0, mid));
    	int right[]=mergesort(Arrays.copyOfRange(arr, mid,arr.length));
    	
    	return merge(left,right);
    }

	public static int[] merge(int[] left, int[] right) {
		
		int i=0;
		int j=0;
		int k=0;
		
		int arr1[]=new int[left.length+right.length];
		
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				arr1[k]=left[i];
				i++;
			}
			else {
				arr1[k]=right[j];
				j++;
			}
			k++;
		}
		
		
		while(i<left.length)
		{
			arr1[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length)
		{
			arr1[k]=right[j];
			j++;
			k++;
		}
		return arr1;
	}
}