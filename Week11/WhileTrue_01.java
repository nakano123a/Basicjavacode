package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {

        int count = 0;   // ค่าเริ่มต้น
        while (true) {   // เงื่อนไข
            count++;
            System.out.println("รอบที่ "+count+" Java");  
            // count++;    // update รอบ
            if (count>=1000) break;
            
        }
    }
}
