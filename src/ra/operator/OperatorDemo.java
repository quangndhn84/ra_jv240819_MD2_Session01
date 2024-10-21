package ra.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
         * 1. Toán tử toán học: +, - , *, /, %, ++, --
         * 2. Toán tử logic: && , ||, !
         * 3. Toán tử quan hệ: >, <, >=, <=, ==, !=
         * 4. Toán tử nhị phân: bit 0 và 1
         * 5. Toán từ gán (=)
         * 6. Toán tử 3 ngôi (exp1 = condition ? exp2 : exp3)
         * */
        int firstNumber = 10;
        int secondNumber = firstNumber++;
        //firstNumber = 11, secondNumber= 10
        int thirthNumber = ++secondNumber;
        //secondNumber = 11, thirthNumber = 11
        System.out.println("secondNumber: " + secondNumber);//11
        System.out.println("thirthNumber: " + thirthNumber);//11
    }
}
