package JAVABASICS;

public class ControlStatementsDemo {

    public static void main(String[] args) {

     
        int number = 10;
        int a;
        int b;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; 
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDo-While Loop:");
        int k = 5;
        do {
            System.out.println("k = " + k);
            k--;
        } while (k > 0);

    
        System.out.println("\nBreak Statement in loop:");
        for (int x = 1; x <= 5; x++) {
            if (x == 4) {
                break; 
            }
            System.out.println("x = " + x);
        }

        System.out.println("\nCalling checkEvenOrOdd function:");
        checkEvenOrOdd(7);
    }


    public static void checkEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
            return;
        }
        System.out.println(n + " is Odd");
    }
}
