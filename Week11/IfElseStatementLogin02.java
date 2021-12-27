package Week11;
import java.util.Scanner;
public class IfElseStatementLogin02 {
    public static void main(String[] args) {
        String Username = "root";
        String Password = "1234";

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter username : ");
     
        String username = kb.nextLine();
        System.out.print("Enter password : ");
        String password = kb.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
         System.out.println("You're logged in.");
        } else {
         System.out.println("Sorry, username or password is incorrect.");
        }
        kb.close();
    }
}
