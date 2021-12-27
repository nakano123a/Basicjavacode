package Week07;
import java.util.Scanner;

public class IfStatement03 {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();
        if (age >= 15) {
            System.out.println("วัยรุ่น");
        }if (age >= 20) {
            System.out.println("วัยหนุ่มสาว");
        } 
        if (age >= 30) {
            System.out.println("วัยทำงาน");
        } 
        if (age >= 40) {
            System.out.println("วัยกลางคน");
        } 
        if (age >= 60) {
            System.out.println("วัยชรา");
        } 

        System.out.println("End of Program");
        kb.close();
    }
}