package ra.casting;

public class CastingDemo {
    public static void main(String[] args) {
        /*
        * CASTING TYPE
        * 1. Implicit: Ngầm định, ép kiểu dữ liệu từ thấp lên cao
        * int -> float -> double
        * 2. Explicit: Tuờng minh, ép kiểu dữ liệu từ cao xuống thấp
        * double -> float -> int
        * */
        //1. Ngầm định
        //10: int --> float: Ép kiểu dữ liệu từ thấp lên cao -> trình biên dịch ngầm định hiểu
        float firstNumber = 10;
        //2. Tường minh
        //2.5: double --> int: ép kiểu từ cao xuống thấp --> tự người lập trình phải ép kiểu --> tường minh
        int secondNumber = (int)2.5;
    }
}
