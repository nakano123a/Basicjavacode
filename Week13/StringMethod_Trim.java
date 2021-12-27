package Week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname="   Suksawat Saelim   ";

        System.out.println(fullname);

        // นับความยาว
        System.out.println(fullname.length());

        System.out.println(fullname.trim());
        System.out.println(fullname.trim().length());

        // .toUpperCase  เปลี่ยนเป็นอ้กษรตัวใหญ่ทั้งหมด
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.trim().toUpperCase());

        // .toLowerCase  เปลี่ยนเป็นอักษรตัวเล็กทั้งหมด
        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.trim().toLowerCase());

        // .substring()   ตัดเอาเฉพาะข้อความที่ต้องการ
        String uni = "Nakhon Pathom Rajabhat University";
        System.out.println(uni.substring(23));
        System.out.println(uni.substring(14,22));

        // .indexOf()   หาตำแหน่งข้อความ
        System.out.println(uni.indexOf("at"));
        System.out.println(uni.indexOf("at",10));
        System.out.println(uni.lastIndexOf("o"));

    }
}
