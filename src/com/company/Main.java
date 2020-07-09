package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String input = "";
        while(true)
        {
            if(sc.hasNext() == false)
            {
                break;
            }
            input = sc.nextLine();
            System.out.println(i+" "+input);
            i++;

        }

    }
}
