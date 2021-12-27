package Week13;

public class StringMethod_Str2Char {
    public static void main(String[] args) {
        String name = "Suksawat";
        char [] alphabet = name.toCharArray();
        System.out.println(alphabet[2]);


        char [] surname = {'S','a','e','l','i','m'};
        String rusult = String.copyValueOf(surname);
        System.out.println(rusult);
    }
}
