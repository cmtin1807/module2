package ss16.thuc_hanh_test.test_file_class;

import java.io.File;
import java.util.Date;

public class TestFileClass {

    public static void main(String[] args) {

        File file = new File("src\\ss16\\Gai.jpg");
        System.out.println("Tên file: " +file.getName());
        System.out.println("Đường dẫn tuyệt đối file: " +file.getAbsolutePath());
        System.out.println("Đường dẫn tương đối file: " +file.getPath());
        System.out.println("File có tồn tại không: " + file.exists());
        System.out.println("Độ lớn của dữ liệu: " + file.length());
        System.out.println("Có phải là thự mục không: " + file.isDirectory());
        System.out.println("Có phải là tệp không: " + file.isFile());
        System.out.println("Tệp cha là gì: " + file.getParentFile());
        System.out.println("Tệp và thư mục có ghi được không: "+ file.canWrite());
        System.out.println("Tệp và thự mục có đọc được không: "+ file.canRead());
        System.out.println("Có phải đường dẫn tuyệt đối hay không: " + file.isAbsolute());
        System.out.println("Có phải là file ẩn hay không "+ file.isHidden());
        System.out.println("Xóa được không: "+ file.mkdir());
        System.out.println("Thời gian sửa chữa cuối cùng: " + new Date(file.lastModified()));

    }

}
