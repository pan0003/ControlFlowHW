package ControlFlowHW;

public class AsciiChars
{
    public static void printNumbers()
    {
        for( char i='0'; i <='9'; ++i)
        {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printLowerCase()
    {
        for( char i='a'; i <='z'; ++i)
        {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printUpperCase()
    {
        for( char i='A'; i <='Z'; ++i)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}