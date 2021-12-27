package Week13;

public class StringMethod_Compare {
    public static void main(String[] args) {
        // การเปรียบเทียบ String
        String lastname1 = "saelim";
        String lastname2 = "Saelim";

        boolean result = lastname1.equals(lastname2);
        System.out.println(result);

        if (result) { // หรือจะใส่ lastname1.equals(lastname2);
            System.out.println("เหมือนกัน");
        } else {
            System.out.println("ไม่เหมือนกัน");
        }
        System.out.println("=================");

        // equalsIgnoreCase ไม่สนใจเรื่อง case sensitive
        if (lastname1.equalsIgnoreCase(lastname2)) {
            System.out.println("เหมือนกัน");
        } else {
            System.out.println("ไม่เหมือนกัน");
        }
    }
}
