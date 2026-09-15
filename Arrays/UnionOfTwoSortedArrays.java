import java.util.ArrayList;//OPTIMIZED APPROACH USING TWO POINTERS
class Practice {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,5,6,7,10};
		int arr2[]= {4,5,6,7,8,9};
		
		ArrayList<Integer> list=new ArrayList<>();
		
		int i=0;
		int j=0;
		int a1=arr1.length;
		int a2=arr2.length;
		
		while(i<a1 && j<a2)
		{
			if(arr1[i]<arr2[j])
			{
				if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
				{
					list.add(arr1[i]);
				}
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				if(list.isEmpty()||list.get(list.size()-1)!=arr2[j])
				{
					list.add(arr2[j]); 
				}
				j++;
			}
			else {
				if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
				{
					list.add(arr1[i]); 
				}
				i++;
				j++;
			}
		}
		
		while(i<a1)
		{
			if(list.isEmpty()||list.get(list.size()-1)!=arr1[i])
			{
				list.add(arr1[i]); 
			}
			i++;
		}
		
		while(j<a2)
		{
			if(list.isEmpty()||list.get(list.size()-1)!=arr2[j])
			{
				list.add(arr2[j]); 
			}
			j++;
		}
		
		System.out.print(list);
	}
}
	 	


// import java.util.Arrays;BRUTE FORCE APPROACH
// import java.util.HashSet;

// class Practice {

// 	public static void main(String[] args) {
// 		int arr1[]= {1,2,3,5,6,7,};
// 		int arr2[]= {4,5,6,7,8,9};
		
// 		HashSet<Integer> set=new HashSet<>();
		
// 		for(int i=0;i<arr1.length;i++)
// 		{
// 			set.add(arr1[i]);
// 		}
		
// 		for(int i=0;i<arr2.length;i++)
// 		{
// 			set.add(arr2[i]);
// 		}
// 		int union[] =new int[set.size()];
// 		int j=0;
// 		for(int num:set)
// 		{
// 			union[j]=num;
// 			j++;
// 		}
		
// 		System.out.print(Arrays.toString(union));
// 	}
// }
	 	