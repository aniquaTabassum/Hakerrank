package com.company;

import restaurant.Employee;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++) {
            BigInteger input = sc.nextBigInteger();
            List<String> compatibleDataTypes = new ArrayList<String>();
            long bigIntToLong = 0;
            try {
                bigIntToLong = input.longValueExact();
                if (bigIntToLong <= Byte.MAX_VALUE && bigIntToLong>=Byte.MIN_VALUE) {
                    compatibleDataTypes.add("byte");
                }
                if (bigIntToLong <= Short.MAX_VALUE && bigIntToLong>=Short.MIN_VALUE) {
                    compatibleDataTypes.add("short");
                }
                if (bigIntToLong <= Integer.MAX_VALUE&& bigIntToLong>=Integer.MIN_VALUE) {
                    compatibleDataTypes.add("int");
                }
                if (bigIntToLong <= Long.MAX_VALUE && bigIntToLong>=Long.MIN_VALUE) {
                    compatibleDataTypes.add("long");
                }

                System.out.println(bigIntToLong + " can be fitted in:");
                for (int i = 0; i < compatibleDataTypes.size(); i++) {
                    System.out.println("* " + compatibleDataTypes.get(i));
                }
            } catch (ArithmeticException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }

        }
    }


}
