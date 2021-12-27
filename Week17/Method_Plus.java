package Week17;

import java.util.Scanner;

public class Method_Plus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = kb.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = kb.nextInt();
        plus(num1, num2);
        subtract(num1, num2);
        kb.close();
    }

    static void plus(int a, int b) { 
        int c = a+b;
        System.out.println("ผลบวกตัวเลข = " + c);
    }

    static void subtract(int a, int b) { 
        int c = a-b;
        System.out.println("ผลลบของตัวเลข = " + c);
    }
}
