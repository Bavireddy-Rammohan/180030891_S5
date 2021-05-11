import java.io.*;
import java.util.*;
import java.lang.*;
public class Program_03 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		if(args.length==0)
		{
            System.out.println("No values");
        }
        else
        {
            for (String v:args)
            {
                System.out.println(v);
            }
        }
	}

}
