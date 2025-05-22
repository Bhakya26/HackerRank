import java.io.*;
import java.util.*;

public class Map {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       sc.nextLine();
       HashMap<String,String> phoneBook=new HashMap<>();
       for(int i=0;i<a;i++){
        String name=sc.nextLine();
        String phone=sc.nextLine();
        phoneBook.put(name,phone);
       }
       while(sc.hasNextLine()){
        String query=sc.nextLine();
        if(phoneBook.containsKey(query)){
            System.out.println(query+"="+phoneBook.get(query));
        }else{
            System.out.println("Not found");
        }
       }
    }
}
