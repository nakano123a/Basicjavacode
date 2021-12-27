package Week07;

public class IfStatement01 {
    public static void main(String[] args) {

        // ตัวอย่างที่ 1 ถ้าต้องการดูส่วนไหนให้เอาคอมเมนท์ออก
        // if (20 > 18) {
        // System.out.println("20 is greater than 18");
        // }
        // System.out.println("End of Program");
        // ----------------------------------------

        // ตัวอย่างที่ 2
        // boolean result = 20 > 18;
        // if (result) {
        // System.out.println("20 is greater than 18");
        // }
        // System.out.println("End of Program");
        // ----------------------------------------

        // ตัวอย่างที่ 3
        // int x = 20;
        // int y = 18;
        // if (x > y) {
        //     System.out.println("x is greater than y");
        // }
        // System.out.println("End of Program");
        // ----------------------------------------

        // ตัวอย่างที่ 4
        int x = 20;
        int y = 15;
        boolean z = x > y; // true, false

        if (z) { // (20>15) , (x>y)
            System.out.println(" 20 is greater than 15");
        }
        System.out.println("end of program");
    }
}