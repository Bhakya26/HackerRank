import java.io.*;
import java.util.*;

import java.util.*;

import java.util.*;

import java.util.*;

class MyCalculator {

    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) Math.pow(n, p);
    }
}

public class ExceptionHandlingII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
        sc.close();
    }
}
