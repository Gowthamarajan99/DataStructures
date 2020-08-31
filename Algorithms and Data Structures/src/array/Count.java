
package array;

import java.util.*;

public class Count {

 public	static long conutTriplet(long [] arr,long r) {
	 Map<Long,Long>rightmap=new HashMap<>();
	 Map<Long,Long>leftmap=new HashMap<>();
	 for(long item:arr) {
		 rightmap.put(item,rightmap.getOrDefault(item,0l)+1);
	 }
	int  count=0;
	 for(int i=0;i<arr.length;i++) {
		 long midterm=arr[i];
		 long c1=0,c3=0;
		 rightmap.put(midterm,rightmap.getOrDefault(midterm,0l)-1);
		 if(leftmap.containsKey(midterm/r) && midterm%r==0) {
			 c1=leftmap.get(midterm/r);
			 
		 }
	
		 if(rightmap.containsKey(midterm*r)){
			 c3=rightmap.get(midterm*r);
		 }
		 count+=c1*c3;
		 leftmap.put(midterm,leftmap.getOrDefault(midterm,0l)+1);
	 }
	 return count;
	
}
 @SuppressWarnings("resource")
public static void main (String arg[]){
	 Scanner inpt=new Scanner(System.in);
	 
	 long n= inpt.nextLong();
	 long r= inpt.nextLong();
	 long[] arr=new long[(int)n];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=inpt.nextLong();
	 }
	long result= conutTriplet(arr,r);
	System.out.println(result);
 }
}
