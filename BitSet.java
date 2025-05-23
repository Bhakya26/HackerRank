import java.io.*;
import java.util.*;

public class BitSet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int M=sc.nextInt();
        BitSet[] bitset=new BitSet[3]; 
        bitset[1]=new BitSet(n);
        bitset[2]=new BitSet(n);
        for(int i=0;i<M;i++){
            String operation=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            switch(operation){
                case "AND":
                  bitset[a].and(bitset[b]);
                  break;
                case "OR":
                  bitset[a].or(bitset[b]);
                  break;
                case "XOR":
                  bitset[a].xor(bitset[b]);
                  break;
                case "FLIP":
                  bitset[a].flip(b);
                  break; 
                case "SET":
                  bitset[a].set(b);
                  break;   
              }
               System.out.println(bitset[1].cardinality() + " " + bitset[2].cardinality());
        }
    }
}
