import java.io.*;
import java.util.*;

public class SubArraySum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] A=new int[a];
        int count=0;
        for(int i=0;i<a;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i;j<A.length;j++){
                sum+=A[j];
                if(sum<0){ count++;}
              }
            }
        
        System.out.println(count);
    }
}
