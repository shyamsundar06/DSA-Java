class MoveZeros {//OPTIMIZED APPROACH USING TWO POINTERS

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    static void moveZeroes(int[] nums) {

        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}

// import java.util.*;BRUTE FORCE APPROACH
// class Movezeros {

// 	public static void main(String[] args) {
// 		int [] arr= {1,3,0,5,3,7,8,0,4,5,0,77,8,0};
		
// 		List<Integer> temp = new ArrayList<>();

// 		for(int i=0;i<arr.length;i++)
// 		{
// 			if(arr[i]!=0)
// 			{
// 				temp.add(arr[i]);
// 			}
// 		}
		
// 		int i=0;
// 		for(int num:temp)
// 		{
// 			arr[i]=num;
// 			i++;
// 		}
		
// 		for(int j=temp.size();j<arr.length;j++)
// 		{
// 			arr[j]=0;
// 		}
// 		System.out.print(Arrays.toString(arr));
// 	}
// }