import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ValidUsername {

    public static void main(String[] args) {
        String regex="^[A-Za-z][A-Za-z0-9_]{7,29}$";
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        Pattern pat = Pattern.compile(regex);
        
        for(int i=0;i<a;i++){
            String username=sc.nextLine();
            Matcher mat = pat.matcher(username);
            if(mat.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
                
            }
            
        }
    }
}
