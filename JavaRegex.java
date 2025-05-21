import java.io.*;
import java.util.*;
class MyRegex{
    String pattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})$";
    }

public class JavaRegex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyRegex reg= new MyRegex();
        while(sc.hasNext()){
            String ip=sc.nextLine();
            System.out.println(ip.matches(reg.pattern));
        }
    
    }

}
