import java.util.*;
import java.io.*;
class Six{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int age = sc.nextInt();
        if(s=="Female" && (age>=1 && age<=58)){
                System.out.println("Percentage of interest is"+" "+"8.2%");
            }
         else if(s=="Female" && (age>=59)){
                System.out.println("Percentage of interest is"+" "+"9.2%");
            }
        else if(s=="Male" && (age>=1 && age<=58)){
                System.out.println("Percentage of interest is"+" "+"8.4%");
            }
        else if(s=="Male" && (age>58)){
                System.out.println("Percentage of interest is"+" "+"10.5%");
            }

        
    sc.close();

    }
}