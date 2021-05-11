import java.io.*;
import java.util.*;
import java.lang.*;
public class P_01 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Elements = ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		System.out.print("Enter Elements in array = ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("Sum of Array = "+sum);
		int average=sum/n;
		System.out.print("\nAverage of Array = "+average);
	}

}
