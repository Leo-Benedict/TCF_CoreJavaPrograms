package JAVABASICS;

public class OperatorsExample 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        int c = a + b;
        System.out.println("Assigned value (c): " + c);

        a++;
        b--;
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);
    }
}
