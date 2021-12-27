package Week17;
import java.util.Scanner;
public class Method_ex03 {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        String myIP = getIP();
        System.out.println(myIP);

        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนเงินเดือน : ");
        double salary = kb.nextDouble();
        System.out.println(salary);

        double bonus= getBonus();
        salary+=bonus;
        System.out.println("เงินเดือน + โบนัส = "+salary);

        kb.close();
    }

    static String getIP(){
        return "127.0.0.1";
    }

    static Double getBonus(){
        return 1000.0;
    }    
}
