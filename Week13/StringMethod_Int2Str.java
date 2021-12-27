package Week13;

public class StringMethod_Int2Str {
    public static void main(String[] args) {
        int number1 = 100;
        double number2 = 50.9;
        
        System.out.println("Before ==> "+(number1+number2));
        
        //String s1 = Integer.toString(number1);
        String s1 = Double.toString(number2);
        System.out.println(s1+number2);
        

        /////////////////////

        String v1 = String.valueOf(number1);
        String v2 = String.valueOf(number2);
        System.out.println(v1+v2);
    }
}
