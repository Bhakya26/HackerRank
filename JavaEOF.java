import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEOF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        for(int i=1;sc.hasNext();i++){
            String line=sc.nextLine();
            System.out.println(i+" "+line);
            
        }
    }
}
