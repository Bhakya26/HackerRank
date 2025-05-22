import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class TwoDArray {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
                }
             }
              System.out.println(maxSum);
    }
}
