package Week11;

public class WhileLoop_01 {
    public static void main(String[] args) {

        int count = 1;   // ค่าเริ่มต้น
        while (count <= 100) {   // เงื่อนไข
            System.out.println("รอบที่ "+count+" Java");   // ค่าที่ต้องการแสดงผล
            count++;    // update รอบ
        }
    }
}
