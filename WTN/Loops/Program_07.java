import java.util.*;
import java.io.*;
public class Program_07{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int k = (int)c;
        if(k>=65 && k<=90){
            k=k+32;
            char e=(char)k;
            System.out.print(e);
        }
        else if(k>=97 && k<=122){
            k=k-32;
            char g=(char)k;
            System.out.print(g);
        }
    }
}