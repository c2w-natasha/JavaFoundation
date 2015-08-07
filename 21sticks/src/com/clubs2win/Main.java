package com.clubs2win;

import org.omg.CORBA.Environment;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int totalSticks = 21;
        int computerPick = 0;

        while (true)
        {
            if(totalSticks<=0)
            {
                System.out.print("You won");
                break;
            }
            System.out.println("It is your turn Player 1. ");
            System.out.println("There are " + totalSticks + " sticks. " + "How many sticks do you want to take 1 or 2?");
            Scanner chosen = new Scanner(System.in);
            int num1 = chosen.nextInt();
            while (num1 != 2 && num1 != 1)
            {
                System.out.println("Only numbers 1 or 2 are allowed. ");
                System.out.println("There are " + totalSticks + " sticks. " + "How many sticks do you want to take 1 or 2?");
                new Scanner(System.in);
                num1 = chosen.nextInt();
            }
            totalSticks = totalSticks - num1;
            if (totalSticks <= 0)
            {
                System.out.print("You lost");
                break;
            }
            else
            {
                if (totalSticks - 2 == 0 || (totalSticks - 2) % 3 == 0)
                {
                    computerPick = 1;
                }
                else
                {
                    computerPick = 2;
                }
            }
            totalSticks = totalSticks - computerPick;
            System.out.println("Computer takes " + computerPick + " sticks. ");
        }
    }
}



