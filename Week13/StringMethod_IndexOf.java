package Week13;

public class StringMethod_IndexOf {
    public static void main(String[] args) {
        String fullname = "   Suksawat Saelim   ";
        System.out.println(fullname.indexOf("wat"));
        System.out.println(fullname.indexOf("java"));

        // ตัดช่องว่างซ้ายขวาของสตริงออก

        // String cleanName = fullname.trim();
        // //System.out.println(cleanName.indexOf("wat"));

        System.out.println(fullname.trim().indexOf("wat"));

        // ตัวพิมพ์ใหญ่ ตัวพิมพ์เล็ก ด้วย toUpperCase และ toLowerCase
        System.out.println(fullname);
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.toLowerCase());

        // ตัดสตริง ด้วย substring
        String uni = "Nakhon Pathom Rajabhat University";
        String s1 = uni.substring(0, 6);

        System.out.println(s1);
        System.out.println(s1 + "Thailand");

    }
}
