
import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_01 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.print("Given Number is Zero");
		}
		else if(n>0)
		{
			System.out.print("Given Number is Positive");
		}
		else
		{
			System.out.print("Given Number is Negative");
		}
	}

}
