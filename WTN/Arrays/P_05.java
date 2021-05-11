import java.io.*;
import java.util.*;
import java.lang.*;
public class P_05 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Elements = ");
		int n=sc.nextInt();
		if(n>=4)
		{
		 int[] a=new int[n];
		System.out.print("Enter array elements = ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.print("largest 2 numbers = "+a[n-1]+","+a[n-2]);
		System.out.print("\nsmallest 2 numbers = "+a[0]+","+a[1]);
		}
	}

}
