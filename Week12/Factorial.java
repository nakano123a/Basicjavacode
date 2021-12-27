package Week12;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = kb.nextInt();

        int i = 1;
        int result=1;

        System.out.print(number+"! ==> ");
        while (i <=number) {
            if (i==number) {
                System.out.print(i);
            } else {
                System.out.print(i+"x");
            }
            
            result = result*i;
            i++;
        }
        System.out.println(" = "+result);
    }
}
