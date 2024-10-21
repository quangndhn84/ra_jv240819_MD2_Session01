package ra.input_output;

public class OutputDemo {
    public static void main(String[] args) {
        //1. In ra chuỗi "Rikkei Academy xin chào tất cả các bạn", sau khi in ra, con trỏ xuống dòng
        System.out.println("Rikkei Academy xin chào tất cả các bạn");
        //2. In ra chuỗi "Chúc các bạn JV240819 có khóa học thành công", sau khi in xong, con trở ở cuối dòng
        System.out.print("Chúc các bạn JV240819 có khóa học thành công.");
        //3. In ra chuỗi "Mong các bạn trong lớp" và chuỗi "có việc làm tốt trong tuơng lai", sau khi in xong xuống dòng
        System.out.println("Mong các bạn trong lớp " + "có việc làm tốt trong tương lai");
        //4. In ra thông tin sinh viên
        String studentId = "SV001";
        String studentName = "Nguyễn Văn A";
        int age = 20;
        boolean sex = true;
        char rank = 'A';
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d - Giới tính: %b - Xếp loại: %c\n",
                studentId, studentName, age, sex, rank);

    }
}
