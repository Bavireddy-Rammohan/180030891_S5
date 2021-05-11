import java.io.*;
import java.util.*;
import java.lang.*;
public class P_03 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Elements = ");
		int n=sc.nextInt();
		System.out.print("Enter Elements in array = ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter number to check = ");
		int b=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("-1");
		}
		
		else
		{
			System.out.print("index value of given number = ");
			for(int i=0;i<n;i++)
			{
				if(a[i]==b)
				{
			      System.out.print(i+" ");
				}
			}
		}
	}

}
