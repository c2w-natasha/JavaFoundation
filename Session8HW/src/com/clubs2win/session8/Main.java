package com.clubs2win.session8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        String str = "" + x;
        String reverse = "";

        int length = str.length();
        System.out.println(str);
        System.out.println(length);
        //str=Integer.toString(in;
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        int revlen = reverse.length();
        System.out.println(revlen);
        if (str.equals(reverse)) {
            System.out.println("True");

        }
        else {
            System.out.println("False");

        }
    }
}
//PALINDROME OR NOT




// EVEN OR ODD
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




package com.clubs2win;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  boolean isPrime(int x){
        int x;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        for (int n = 2; n < x; n++) {
            if (x % n!=0)
                System.out.println("true");
            else {
                System.out.println("false");
                break;
            }
        }
    }
}
// PRIME NUMBER OR NOT.






