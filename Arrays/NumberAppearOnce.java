class Practice {
    public static void main(String[] args) {
    	int[] arr= {1,1,2,2,3,5,5};
    	
    	int xor=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		xor=xor^arr[i];
    	}
    	System.out.print(xor);
    }   
}

// class Practice {BETTER APPROACH
//     public static void main(String[] args) {
//     	int[] arr= {1,1,2,2,3,5,5};
    	
//     	int max=0;
//     	for(int i=0;i<arr.length;i++)
//     	{
//     		if(arr[i]>max)
//     		{
//     			max=arr[i];
//     		}
//     	}
    	
//     	int hash[]=new int[max+1];
    	
//     	for(int i=0;i<arr.length;i++)
//     	{
//     		hash[arr[i]]++;
//     	}
    	
//     	for(int i=0;i<hash.length;i++)
//     	{
//     		if(hash[i]==1)
//     		{
//     			System.out.print(i);
//     		}
//     	}
//     }   
// }

// class Practice {BRUTE FORCE APPROACH
//     public static void main(String[] args) {
//     	int[] arr= {1,1,2,2,3,5,5};
//     	int c;
    	
//     	for(int i=0;i<arr.length;i++)
//     	{
//     		int num=arr[i];
//     		c=0;
//     		for(int j=0;j<arr.length;j++)
//     		{
//     			if(num==arr[j])
//     			{
//     				c++;
//     			}
//     		}
//     		if(c==1)
//     		{
//     			System.out.print(num);
//     		}
//     	}
//     }
// }