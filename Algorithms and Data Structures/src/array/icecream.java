package array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class icecream {

	static int[] Icecream(int [] arr,int m) {
		int [] result=new int[2];
		HashMap<Integer,Integer>Map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int y=m-x;
			Integer j=Map.get(y);
			if(j!=null) {
				result[0]=i+1;
				result[1]=j+1;
				break;
			}
			Map.put(x,i);
		}
		 return result;
	}
	public static void main(String args[]) {
		Scanner inpt=new Scanner(System.in);
		int m=inpt.nextInt();
		int n=inpt.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=inpt.nextInt();
		  
			
		}
		int []res= Icecream(arr,m);
		System.out.println(res[1]+" "+res[0]);
	
	
	}
}
