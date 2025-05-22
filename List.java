import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       List<Integer> line=new ArrayList<>();
       for(int i=0;i<n;i++){
        line.add(sc.nextInt());
       }
       int q=sc.nextInt();
       sc.nextLine();
       for(int i=0;i<q;i++){
        String command=sc.nextLine();
        if(command.equals("Insert")){
            String[] parts=sc.nextLine().split(" ");
            int index=Integer.parseInt(parts[0]);
            int value=Integer.parseInt(parts[1]);
            line.add(index, value);
        }
        else if(command.equals("Delete")){
            int index=Integer.parseInt(sc.nextLine());
            line.remove(index);
        }
       }
       for(int num:line){
        System.out.print(num+" ");
       }
    }
}
