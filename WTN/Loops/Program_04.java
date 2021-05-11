import java.io.*;
import java.lang.*;
import java.util.*;
public class Program_04 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char s=sc.next().charAt(0);
		int a=(int)c;
		int b=(int)s;
		if(a<b){
            System.out.println(c+" "+s);
        }
        else{
            System.out.println(s+" "+c);
        }
	}
}