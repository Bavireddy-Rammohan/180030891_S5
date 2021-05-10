//1B
import java.util.*;
import java.io.*;
class OneB{
    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=n%10;
        int u=m%10;
        if(r==u){
             System.out.println("True");
        }
        else{
             System.out.println("False");
        }
    }
}