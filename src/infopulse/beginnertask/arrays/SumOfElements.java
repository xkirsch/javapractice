//method for task Array6, Abramyan
package infopulse.beginnertask.arrays;
public class SumOfElements {
	public static void addPrevious(int[] arr,int a,int b) {
			 arr[0]=a;
			 arr[1]=b;
			 int x=a+b; for (int i=2;i<arr.length;i++) { arr[i]=x; x=2*x; }
			 ArraysHelper.print (arr);}
		
}
