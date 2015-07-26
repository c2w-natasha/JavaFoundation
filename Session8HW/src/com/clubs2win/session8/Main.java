




// PRIME NUMBER OR NOT.
package com.clubs2win.session8;

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









