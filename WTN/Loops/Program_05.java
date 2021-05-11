import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_05 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if((c>=65 && c<=90) || (c>=97 && c<=122))
		{
			System.out.print("Alphabet");
		}
		else if((c>=33 && c<=47) || (c>=91 && c<=96) ||(c>=123 && c<=126))
		{
			System.out.print("Special Character");
		}
		else
		{
            System.out.print("Digit");
        }
	}
}
