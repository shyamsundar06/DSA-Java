class Practice {
    public static void main(String[] args) {
    	int[] arr= {1,2,3,5};
    	int n=5;
    	
    	int sum=(n*(n+1))/2;
    	int s2=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		s2+=arr[i];
    	}
    	System.out.print(sum-s2);
    }
}

// class Practice {BETTER APPROACH
//     public static void main(String[] args) {
//     	int[] arr= {1,2,3,5};
//     	int n=5;
    	
//     	int hash[]=new int[n+1];
    	
//     	for(int i=0;i<arr.length;i++)
//     	{
//     		hash[arr[i]]++;
//     	}
    	
//     	for(int i=1;i<hash.length;i++)
//     	{
//     		if(hash[i]==0)
//     		{
//     			System.out.print(i);
//     		}
//     	}
//     }
// }



// class Practice {BRUTE FORCE APPROACH
//     public static void main(String[] args) {
//     	int[] arr= {1,2,3,5};
//     	int n=5;
//     	int flag;
//     	for(int i=1;i<=n;i++)
//     	{	
//     		flag=0;
    		
//     		for(int j=0;j<arr.length;j++)
//     		{
//     			if(arr[j]==i)
//     			{
//     				flag=1;
//                  break;
//     			}
//     		}
//     		if(flag==0)
//     		{
//     			System.out.print(i);
//     		}
//     	}
//     }
// }