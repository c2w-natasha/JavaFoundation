
package com.clubs2win.session8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        // write your code here
        //HW for session 8
        if (n % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
// EVEN OR ODD 