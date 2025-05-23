import java.io.*;
import java.util.*;

public class Generics {
    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
         Integer[] arr={1,2,3};
         String [] sarr={"Hello","World"};
         printArray(arr);
         printArray(sarr);
        
    }
}
