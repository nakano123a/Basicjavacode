package Week17;

public class Method_ex04 {
    public static void main(String[] args) {
        // โปรแกรมหลัก
        int result = maxNumber(5, 8);
        System.out.println("ค่ามาก คือ " + result);
        System.out.println("ผลรวม คือ " + summation(500, 300));
    }

    // โปรแกรมย่อย เปรียบเทียบตัวเลขสองตัว แล้วบอกว่าตัวใดมากสุด
    static int maxNumber(int a, int b) {
        // ประมวลผล
        int max = 0;
        if (a > b) {
            max = a;
            // return a;
        } else {
            max = b;
            // return b;
        }
        return max;
    }

    static int summation(int a, int b){
        int total = a+b;
        return total;
        
        //return a+b;
    }
}
