package Week13;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Saelim";
        String lastname2 = "saelim";

        // .equals() เปรียบเทียบเท่ากันหรือไม่เท่ากัน เช็ค case sensitive
        boolean result = lastname1.equals(lastname2);
        // System.out.println(result);

        if (result) {
            System.out.println(lastname1 + " เหมือนกันกับ " + lastname2);
        } else {
            System.out.println(lastname1 + " ไม่เหมือนกันกับ " + lastname2);
        }

        // .equalsIgnoreCase() เปรียบเทียบเท่ากันหรือไม่เท่ากัน ไม่เช็ค case sensitive
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);
        // System.out.println(result2);

        if (result2) {
            System.out.println(lastname1 + " เหมือนกันกับ " + lastname2);
        } else {
            System.out.println(lastname1 + " ไม่เหมือนกันกับ " + lastname2);
        }
    }
}
