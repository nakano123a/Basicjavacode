package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        // .startsWith()  ให้ห้าคำทึ่ต้องการจากด้านหน้า
        String fullname = "นายสมชาย  เข็มขัด";

        boolean name = fullname.startsWith("นาย");
        //System.out.println(name);
        //System.out.println(fullname.startsWith("นาย"));
        if (name) {
            System.out.println(fullname + " เป็นเพศชาย");
        } else {
            System.out.println(fullname + " เป็นเพศหญิง");
        }

        // .endsWith()  ให้หาคำที่ต้องการจากด้านหลัง
        String code = "25738467TH";
        boolean no = code.endsWith("TH");
        if (no) {
            System.out.println("รหัส " + code + " มาจากไทย");
        } else {
            System.out.println("รหัส " + code + "ไม่ได้มาจากไทย");            
        }
    }
}
