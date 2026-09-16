import java.util.ArrayList;//OPTIMAL APPROACH
class Practice {
    public static void main(String[] args) {

       int a[]= {1,2,2,3,3,4,5,6};
       int b[]= {2,3,3,5,6,6,7};
       ArrayList<Integer> list=new ArrayList<>();
       
       int i=0;
       int j=0;
       while(i < a.length && j < b.length)
       {
    	   if(a[i]==b[j])
    	   {
    		   list.add(a[i]);
    		   i++;
    		   j++;
    	   }
    	   else if(b[j]>a[i])
    	   {
    		   i++;
    	   }
    	   else {
    		   j++;
    	   }
       }
       System.out.print(list);
    }
}

// import java.util.ArrayList;BRUTE FORCE APPROACH
// class Practice {
//     public static void main(String[] args) {
//        int a[]= {1,2,2,3,3,4,5,6};
//        int b[]= {2,3,3,5,6,6,7};
//        int visited[]=new int[b.length];
//        ArrayList<Integer> list=new ArrayList<>(); 
//        for(int i=0;i<a.length;i++)
//        {
//     	   for(int j=0;j<b.length;j++)
//     	   {
//     		   if(a[i]==b[j] && visited[j]==0)
//     		   {
//     			   list.add(a[i]);
//     			   visited[j]=1;
//     			   break;
//     		   }
//     		   if(b[j]>a[i])
//     		   {
//     			   break;
//     		   }
//     	   }
//        }
//        System.out.print(list);
//     }
// }