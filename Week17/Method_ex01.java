package Week17;

class Method_ex01 {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.println("Hello World");


        // เรียกใช้งาน method
        display();
        plus();
        plus();

        openVideo();
        playVideo();
        pauseVideo();
        playVideo();


    }

    // สร้างเมธอด
    static void display() {
        // สร้างกลุ่มคำสั่ง
        System.out.println("Hello World");

    }

    static void plus() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("ผลบวก เท่ากับ " + c);
    }


    static void openVideo() {
        //คำสั่งเปิดไฟล์วิดีโอ
        System.out.println("เปิดไฟล์วิดีโอ");

    }
    static void playVideo() {
        //คำสั่งล่นวิดีโอ
        System.out.println("เล่นวิดีโอ");

    }
    static void pauseVideo() {
        //คำสั่งหยุดวิดีโอ
        System.out.println("หยุดวิดีโอ");

    }


}