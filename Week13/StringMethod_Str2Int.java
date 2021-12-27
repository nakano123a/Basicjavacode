package Week13;

public class StringMethod_Str2Int {
    public static void main(String[] args) {
        String s1 = "500";
        int num1 = 20;
        
        System.out.println(s1 + num1);
        
        int num2 = Integer.parseInt(s1);
        System.out.println(num2 + num1);
        
        String s2 = "3.141";
        double num3 = Double.parseDouble(s2);
        System.out.println(num3 + num1);
    }
}
