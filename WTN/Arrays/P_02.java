import java.io.*;
import java.util.*;
import java.lang.*;
public class P_02 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Elements = ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("Enter Elements in Array = ");
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
		System.out.print("Maximum value = "+a[n-1]);
		System.out.print("\nMinimum value = "+a[0]);
	}

}
