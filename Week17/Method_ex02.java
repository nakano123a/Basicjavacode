package Week17;

public class Method_ex02 {
    public static void main(String[] args) {
        display("คาบเรียนสุดท้ายแล้ว"); // ส่ง argument
        fullname("สมชาย", "เข็มขลัด");
        plus(10, 20);
    }

    // สร้างเมธอด
    static void display(String message) { // รับค่าผ่าน parameter
        System.out.println(message);
    }

    static void fullname(String fname, String lname) { // รับค่าผ่าน parameter
        System.out.println("ชื่อ = " + fname + " นามสกุล = " + lname);
    }

    static void plus(int a, int b) { 
        int c = a+b;
        System.out.println("ผลบวกตัวเลข = " + c);
    }

}
