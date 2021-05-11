import java.io.*;
import java.util.*;
import java.lang.*;
public class Box {
	double w,h,d;
	Box(double width,double height,double depth) {
		w=width;
		h=height;
		d=depth;
	}
	double volume()
	{
		double v;
		v=w*h*d;
		return v;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double w,h,d;
		System.out.print("Enter Width = ");
		w=sc.nextDouble();
		System.out.print("Enter Height = ");
		h=sc.nextDouble();
		System.out.print("Enter Depth = ");
		d=sc.nextDouble();
		Box p=new Box(w,h,d);
		System.out.println("Volume of Box = "+p.volume());
	}
}
