package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите диапазон");
        System.out.print("num1 = ");
        int num1 = in.nextInt();
        System.out.print("num2 = ");
        int num2 = in.nextInt();
        if ((num1 > num2) | (num1 < 0) | (num2 < 0))
        {
            throw new NullPointerException("введен неверный диапазон");
        }
        else
        {
            for (int P = num1; P <= num2; P++)
            {
                boolean b = true;
                for (int i = 2; i < P; i++)
                {
                    if(P % i == 0)
                    {
                        b = false;
                        break;
                    }
                }
                if(P == 0) b = false;
                if (b) System.out.print(P+" ");
            }
        }
    }
}
