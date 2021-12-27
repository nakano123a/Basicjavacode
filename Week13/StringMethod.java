package Week13;

public class StringMethod {
    public static void main(String[] args) {
        // นิยาม String
        String name = "suksawat";
        String city = new String("Nakhon Pathom"); // สร้างแบบ obj

        System.out.println(name);
        System.out.println(city);

        // Concatenation การต่อ string
        System.out.println(name + city);

        String result = name + city; /// ฝากไว้ในตัวแปรตัวอื่นก่อน
        System.out.println(result);

        String result2 = name + city + ".com";
        System.out.println(result2);
        System.out.println(result2.concat(".ac.th")); // บางครั้งอาจกันซับซนกับเครื่องหมายบวก

        // หาความยาวของ string ใช้เมธอด .length
        System.out.println(name.length());
        System.out.println(city.length());

        int count = name.length(); // method นี้จะคืนค่ากับมาเป็น int
        System.out.println(count);

        // หาตำแหน่งตัวอักษร ใช้ charAt โดยระบุตัวเลขตำแหน่ง
        System.out.println(name.charAt(2));
    }
}
