package Week11;

public class While_SumNumber {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number<=10) {
            sum = sum+number;
            System.out.println("รอบที่ "+number+" ผลบวกเท่ากับ "+ sum);
            number++;

        }
        System.out.println("รวมเท่ากับ "+sum);
    }
}
