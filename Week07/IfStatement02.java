package Week07;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        System.out.println("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();

        if (age >= 15) {
            System.out.println("คำนำหน้า คือ นาย/นางสาว");
        }
        System.out.println("End of Program");
    }

}
