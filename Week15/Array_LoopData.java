package Week15;

public class Array_LoopData {
    public static void main(String[] args) {
        String [] car = {"BMW","Benz","Toyota","Honda"};

        System.out.println(car.length);  // ความยาว หรือขนาดของอาเรย์

        // แสดงผลข้อมูลในอาเรย์โดยใช้ Loop for
        for (int i = 0; i < car.length; i++) {
            System.out.println("ตำแหน่งที่ "+i+" คือ "+car[i]);
        }

        for (int i = 0; i < car.length; i++) {
            System.out.println("ช่องที่ "+(i+1)+" คือ "+car[i]);
        }


        // System.out.println(car[0]);
        // System.out.println(car[1]);
        // System.out.println(car[2]);
        // System.out.println(car[3]);


    }
}
