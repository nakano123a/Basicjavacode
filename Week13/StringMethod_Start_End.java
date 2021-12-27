package Week13;
public class StringMethod_Start_End {
    public static void main(String[] args) {
        //การหาคำที่อยู่ข้างหน้า  
        String fullname = "นายสมชาย  เข็มขัด";

        boolean result = fullname.startsWith("นาย");
        System.out.println(result);

        if (result) {
            System.out.println("เพศชาย");
        } else {
            System.out.println("เพศหญิง");            
        }

        String code = "387344555TH";
        if(code.endsWith("TH")){
            System.out.println("From Thailand");
        }else{
            System.out.println("From foreign countries");
        }


    }
}
