
import java.util.*;
import java.io.*;
import java.lang.*;
class ThreeA{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    
        if(args.length==0){
            System.out.println("No values");
        }
        else{
            for (String v:args){
                System.out.println(v);
        }
        }
        sc.close();
    }
}