import java.io.*;
import java.util.*;
import java.lang.*;
public class Patient {
	double w,h;
	Patient(double height,double width)
	{
		h=height;
		w=width;
	}
	double computeBMI()
	{
		double f=w/(h*h);
		return f;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter patient name = ");
		String patientname=sc.nextLine();
		System.out.print("Enter patient Height = ");
		double height=sc.nextDouble();
		System.out.print("Enter patient Width= ");
		double width=sc.nextDouble();
		Patient p=new Patient(height,width);
		System.out.print("Compute BMI = "+p.computeBMI());
	}

}
