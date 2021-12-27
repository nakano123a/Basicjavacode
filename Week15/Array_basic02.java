package Week15;

public class Array_basic02 {
    public static void main(String[] args) {
        //การประกาศอาเรย์

        //แบบที่ 1 ระบุสมาชิก
        int [] number = {1,3,5,66,44,22,3,1};
        String [] animal = {"cat","rat","bat"};

        //การเข้าถึงข้อมูล
        System.out.println(animal[1]);
        System.out.println(animal[0]);
        System.out.println(number[3]);

        //หาความยาวหรือขนาดของข้อมูลในอาเรย์   .length
        int size = number.length;
        System.out.println(size); 

        System.out.println(animal.length);

        //แบบที่ 2 ระบุขนาดอาเรย์
        char [] alphabet = new char [26];
        double [] num = new double [3];

        //แสดงผลค่าในอาเรย์แต่ละช่อง        
        System.out.println(num[0]);
        System.out.println(alphabet[0]);

        //การกำหนดค่าให้กับอาเรย์แต่ละข่อง
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[25] = 'z';
        System.out.println(alphabet[0]);

    }
}
