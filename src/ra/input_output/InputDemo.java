package ra.input_output;


import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /*
         * Các bước để nhập giá trị từ bàn phím:
         *   B1: Khởi tạo đối tượng Scanner (java.util)
         *   B2: Thông báo nhập
         *   B3: Sử dụng các phương thức của Scanner lấy giá trị nhập từ bàn phím gán vào biến
         * */
        //1. Nhập mã sinh viên
        //- B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //- B2: Thông báo nhập
        System.out.println("Nhập vào mã sinh viên:");
        //- B3: Lấy giá trị nhập từ bàn phím và lưu vào biến studentId
        String studentId = scanner.nextLine();
        //2. Nhập vào tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //3. Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
//        int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        //4. Nhập giới tính sinh viên
        System.out.println("Nhập vào giới tính sinh viên:");
//        boolean sex = scanner.nextBoolean();
        boolean sex = Boolean.parseBoolean(scanner.nextLine());
        //C1: Xóa phím enter trong bộ nhớ bằng scanner.nextLine();
//        scanner.nextLine();
        /*
        * C2: Coi như tất cả dữ liệu đầu vào đều là String, sử dụng các phương thức sau để convert từ String sang kiểu dữ liệu khác
        * String --> int: Integer.parseInt("String")
        * String --> float: Float.parseFloat("String")
        * String --> double: Double.parseDouble("String")
        * String --> boolean: Boolean.parseBoolean("String")
        *
        * */
        //5. Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ:");
        String address = scanner.nextLine();

        //THÔNG TIN SINH VIÊN
        System.out.println("THÔNG TIN SINH VIÊN VỪA NHẬP:");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Địa chỉ: " + address);
    }
}
