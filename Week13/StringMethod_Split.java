package Week13;

public class StringMethod_Split {
    public static void main(String[] args) {
        String data = "mango,banana,orange";
        String [] fruit = data.split(",");

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);            
        }
    }
}
