import java.io.*;
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        Map<Character,Integer> mapA=new HashMap<>();
        Map<Character,Integer> mapB=new HashMap<>();
        for(char c:a.toCharArray()){
            mapA.put(c,mapA.getOrDefault(c,0)+1);
        }
        for(char c:b.toCharArray()){
            mapB.put(c,mapB.getOrDefault(c,0)+1); 
            }
            return mapA.equals(mapB);
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       String b=sc.nextLine();
       boolean flag=isAnagram(a,b);
       if(flag){
        System.out.println("Anagrams");
       }else{
        System.out.println("Not Anagrams");
       }
    }
}
