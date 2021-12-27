package Week07;
public class IfStatementLogin {
    public static void main(String[] args) {
        String username = "suksawat";
        String password = "1234";

        if (username == "suksawat") {
            System.out.println("This username has a permission.");
        }

        if (username == "suksawat" && password == "12345") {
            System.out.println("You're logged in");
        }
    }

}
