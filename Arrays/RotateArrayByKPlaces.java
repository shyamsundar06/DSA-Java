import java.util.Arrays;
//TC =O(d+d+(n-d)) => O(n+d)
//SC=> O(d)
class RotateArrayByKPlaces{//BRUTE FORCE APPROACH

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		
		int temp[]=new int[k];
		
		for (int i=0;i<k;i++)
		{
			temp[i]=arr[i];
		}
		
		for(int i=k;i<arr.length;i++)
		{
			arr[i-k]=arr[i];
		}
		
		int j=0;
		
		for(int i=arr.length-k;i<arr.length;i++)
		{
			arr[i]=temp[j];//use i-(n-d) also
			j++;
		}
		
		System.out.print(Arrays.toString(arr));
	}

}

// import java.util.Arrays; OPTIMAL SOLUTION NO EXTRA SPACE BUT MORE TIME COMPLEXITY

// public class RotateArray {

//     public static void main(String[] args) {

//         int[] nums = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;

//         k = k % nums.length;

//         // LEFT ROTATION
//         reverse(0, k - 1, nums);
//         reverse(k, nums.length - 1, nums);
//         reverse(0, nums.length - 1, nums);

//         /*
//         // RIGHT ROTATION
//         reverse(0, nums.length - 1, nums);
//         reverse(0, k - 1, nums);
//         reverse(k, nums.length - 1, nums);
//         */

//         System.out.println(Arrays.toString(nums));
//     }

//     public static void reverse(int st, int end, int[] arr) {

//         while (st <= end) {

//             int temp = arr[st];
//             arr[st] = arr[end];
//             arr[end] = temp;

//             st++;
//             end--;
//         }
//     }
// }
