import java.util.*;
import java.io.*;
public class Program_14{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print(sum);
    }
}