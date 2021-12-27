package Week11;

public class WhileTrue {
    public static void main(String[] args) {
        int count=1;
        while (true) {
            // System.out.println("Hello World");
            System.out.println("รอบที่ "+count+" Hello World");
            count++;
            if (count==20) {
                break;
            }
        }
    }
}
