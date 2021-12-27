package Week15;

public class Array_InsertOddNumber {
    public static void main(String[] args) {
        // int [] n = {1,3,5,7,9,11,13,15,17,19};
        int[] number = new int[10];

        // ก่อนเพิ่มข้อมูลในอาเรย์
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        // เพิ่มข้อมูลเลขคี่เข้าอาเรย์ที่จองไว้
        int n = 1;  // กำหนดค่าเริ่มต้นให้กับเลขคี่
        for (int i = 0; i < number.length; i++) {
            number[i] = n;
            n+=2;   // n = n+2;
        }
        // หลังเพิ่มข้อมูลในอาเรย์
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }




        // number[0]= 1;
        // number[1]= 3;
        // number[2]= 5;
        // number[3]= 7;
        // number[4]= 9;
        // number[5]= 11;
        // number[6]= 13;

    }
}
