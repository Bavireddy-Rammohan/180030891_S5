import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_17 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		int n=sc.nextInt();
		int a;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			System.out.print(a);
		}
	}
}
