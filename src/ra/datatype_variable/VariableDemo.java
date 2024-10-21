package ra.datatype_variable;

public class VariableDemo {
    public static void main(String[] args) {
        /*
         * Syntax khai báo biến:
         *   Datatype variableName;
         * Syntax khai báo và khởi tạo giá trị cho biến:
         *   Datatype variableName = value
         * Syntax khai báo hằng số
         *   final Datatype CONSTANT_NAME = value;
         * */
        //1. Khai báo biến mã sinh viên, tên sinh viên và tuổi
        String studentId;
        String studentName;
        int age;
        //2. Khởi tạo giá trị cho các biến mã sinh viên, tên sinh viên và tuổi
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        age = 18;
        //3. Khai báo và khởi tạo giá trị cho các biến điểm trung bình, giới tính, địa chỉ của sinh viên
        // Ctrl + Alt + L: format code
        float avgMark = 8.7F;
        boolean sex = true;
        String address = "1, Phạm Hùng, Nam Từ Liêm, Hà Nội";
        //4. Khai báo hắng số điếm qua môn là 5.
        final float MARK_PASS = 5;
    }
}
