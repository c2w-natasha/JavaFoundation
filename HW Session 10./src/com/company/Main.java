package com.company;

public class Main {

    public static void main(String[] args) {

       }
    public String helloName(String name) {

        return "Hello " + name + "!";

    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public String theEnd(String str, boolean front) {
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        if(front == true){
            return first;
        }
        else{
            return last;
        }
    }
    public String middleTwo(String str) {

        int n=str.length();
        String o = str.substring(n/2-1,n/2+1);
        return o;
    }

    public String deFront(String str) {
        String lol = str.substring(2);
        String a = str.substring(0,1);
        String b = str.substring(1,2);

        if(b.equals("b") && a.equals("a")){
            return str;
        }

        if(a.equals("a")){
            return str= a + lol;
        }
        if(b.equals("b")){
            return b + lol;
        }
        else{
            return lol;
        }
    }
}

