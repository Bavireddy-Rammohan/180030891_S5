
import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_02 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.print("Even number");
		}
		else
		{
			System.out.print("Odd number");
		}
	}

}
