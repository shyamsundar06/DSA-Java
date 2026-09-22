import java.util.Arrays;
class In2dMatrixtwo {

	public static void main(String[] args) {
		int [][] arr= {
				{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24},
				{18,21,23,26,30}
		};
		
		int target=30;
		System.out.print(Arrays.toString(find(arr,target)));
	}

	static int[] find(int[][] arr, int target) {
		
		int row=0;
		int col=arr[0].length-1;
		int n=arr.length;
		
		while(row<n&&col>=0)
		{
			if(arr[row][col]==target)
			{
				return new int[] {row,col};
			}
			else if(arr[row][col]>target)
			{
				col--;
			}
			else {
				row++;
			}
		}
		return new int[] {-1,-1};
	}

}
