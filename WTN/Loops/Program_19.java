import java.io.*;
import java.lang.*;
import java.util.*;
public class Program_19 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5,i=0;
		while(i<=n)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
			
	}

}
