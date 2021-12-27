package Week13;
public class StringMethod_Raplace {
    public static void main(String[] args) {
        //การหาคำที่อยู่ข้างหน้า  
        String message = "Happy New Year 2020 | Happy Birthday 2020";
        System.out.println("Before ==> " + message);
        message = message.replace("2020","2021");
        //message = message.replaceFirst("2020","2021");
        System.out.println("After ==> " + message);
    }
}
