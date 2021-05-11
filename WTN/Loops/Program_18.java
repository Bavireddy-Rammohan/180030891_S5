import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_18 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		int n=sc.nextInt();
		int temp=n;
		int b=n;
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		int[] a=new int[c];
		for(int i=0;i<c;i++)
		{
			a[i]=temp%10;
			temp=temp/10;
		}
		int k=0;
		for(int i=0;i<c;i++)
		{
			k=10*k+a[i];
		}
		if(b==k)
		{
			System.out.print(b+" is a palindrome");
		}
		else
		{
			System.out.print(b+" is not a palindrome");
		}
	}

}
