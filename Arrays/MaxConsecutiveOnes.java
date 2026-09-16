class Practice {
    public static void main(String[] args) {
    	int[] arr= {1,2,1,1,3,4,1,1,1,1};
    	
    	int maxc=0;
    	int count=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==1)
    		{
    			count++;
    			maxc=Math.max(count, maxc);
    		}
    		else {
    			count=0;
    		}
    	}
    	System.out.print(maxc);
    }
}