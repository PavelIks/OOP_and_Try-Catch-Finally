package com.company;
import java.util.Scanner;

class TestMyEx extends Exception
{
    public TestMyEx(String msg)
    {
        super(msg);
    }
    @Override
    public String getMessage()
    {
        return super.getMessage() + " (MY EXCEPTION)";
    }
}

class Figura
{
    public static void Kvadrat(int storona1, int storona2, int storona3, int storona4)
    {
        System.out.println("Сторона-1 квадрата: " + storona1);
        System.out.println("Сторона-2 квадрата: " + storona2);
        System.out.println("Сторона-3 квадрата: " + storona3);
        System.out.println("Сторона-4 квадрата: " + storona4);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Введите число 1: ");
            int a1 = in1.nextInt();

            Scanner in2 = new Scanner(System.in);
            System.out.print("Введите число 2: ");
            int a2 = in2.nextInt();

            Scanner in3 = new Scanner(System.in);
            System.out.print("Введите число 3: ");
            int a3 = in3.nextInt();

            Scanner in4 = new Scanner(System.in);
            System.out.print("Введите число 4: ");
            int a4 = in4.nextInt();

            Figura.Kvadrat(a1, a2, a3, a4);

            if
            (
                       a1 != a2 || a1 != a3 || a1 != a4
                    || a2 != a1 || a2 != a3 || a2 != a4
                    || a3 != a1 || a3 != a2 || a3 != a4
                    || a4 != a1 || a4 != a2 || a4 != a3
            )
            {
                throw new TestMyEx("Это не квадрат!");
            }
        }
        catch (TestMyEx testmyex)
        {
            System.out.println(testmyex.getMessage());
        }
        finally
        {
            System.out.print("Ok!");
        }
    }
}