import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PatternSyntaxCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=Integer.parseInt(sc.nextLine());
        for(int i=0;i<testcases;i++){
            String pattern=sc.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
