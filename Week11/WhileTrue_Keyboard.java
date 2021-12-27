package Week11;

import java.util.Scanner;

public class WhileTrue_Keyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number : ");
            int number = kb.nextInt();
            
            if (number==0) {
                break;
            }
        }
        
    }
}
