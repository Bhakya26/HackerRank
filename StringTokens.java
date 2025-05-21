import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] words=a.trim().split("[^A-Za-z]+");
        if(a.trim().isEmpty()){
            System.out.println(0);
         }else{
        
        System.out.println(words.length);
        for(String word:words){
            System.out.println(word);
        }
    }
}
}
