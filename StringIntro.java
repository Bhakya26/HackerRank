import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String capA=A.substring(0,1).toUpperCase()+A.substring(1);
        String capB=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capA+" "+capB);
        /* Enter your code here. Print output to STDOUT. */
        }
}



