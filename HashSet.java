import java.io.*;
import java.util.*;

public class HashSet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        HashSet<String> lines=new HashSet<>();
        for(int i=0;i<n;i++){
           String line=sc.nextLine();
           String[] lineparts=line.split(" ");
           String person1=lineparts[0];
           String person2=lineparts[1];
           String[] pair= new String[]{person1,person2};
           Arrays.sort(pair);
           String sortedPair=pair[0]+" "+pair[1];
           lines.add(sortedPair);
           System.out.println(lines.size());
        }
        
        
    }
}
