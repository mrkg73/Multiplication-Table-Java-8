
import java.util.Scanner;

import java.util.stream.IntStream;

public class MultiplicationTable
{
    public static void main (String[] args)
    {
        Scanner src = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int num = src.nextInt();

       IntStream.rangeClosed(1,10).forEach(x-> System.out.println(num +" x " + x + " = " + num*x)
       );
    }

}
