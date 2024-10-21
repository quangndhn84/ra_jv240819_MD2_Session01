package ra;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int number1 = 10;
        float number2 = 4.3F;
        int[] arrNumbers = {1, 3, 5, 7};
        int sum = addTwoNumbers(5, 7);
//        final float PI = 3.14F;
        System.out.println("Tổng 2 số là: " + sum);
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;
        return total;
    }
}
