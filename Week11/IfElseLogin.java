package Week11;
import java.util.Scanner;
public class IfElseLogin {
    public static void main(String[] args) {
        // String user = "admin";
        // String pwd = "12345";

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter username : ");
     
        String user = kb.nextLine();
        System.out.print("Enter password : ");
        String pwd = kb.nextLine();


        if (user == "admin" && pwd == "12345") {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Fail");
        }
    }

}
