import java.io.*;
import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> datalist=new ArrayList<>();
        for(int i=0;i<n;i++){
            int lineno=sc.nextInt();
            List<Integer> line=new ArrayList<>();
            for(int j=0;j<lineno;j++){
                line.add(sc.nextInt());
             }
             datalist.add(line);
        }
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(datalist.get(x-1).get(y-1));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
      }
    }

