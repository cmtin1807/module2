package ss19.bai_tap_ve_nha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        1. Kiểm tra định dạng ngày tháng năm
//            ->dd/mm/yyyy
//            Phần ngày: là số và có thể từ 01 đến 31
//            Phần tháng: là số và có thể từ 01 đến 12
//            Phần năm: là 4 chữ số
//
        Pattern pattern1 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$");
        Matcher matcher1 = pattern1.matcher("31/12/2023");
        boolean isMatch1 = matcher1.matches();
        System.out.println(isMatch1);


//        2. Kiểm tra giờ hợp lệ:
//        HH:MM
//        Giờ: từ 00 đến 23 và là số có 2 chữ số
//        Phút: từ 00 đến 59 là số có 2 chữ số

        Pattern pattern2 = Pattern.compile("^([01][0-9]|2[0-3]):[0-5][0-9]$");
        Matcher matcher2 = pattern2.matcher("23:59");
        boolean isMatch2 = matcher2.matches();
        System.out.println(isMatch2);

//        3. Kiểm tra số thẻ tín dụng: Một số thẻ tín dụng thường có 16 chữ số.
//        có thể được nhóm thành 4 nhóm cách nhau bởi dấu gạch ngang (-) hoặc khoảng trắng.



        Pattern pattern3 = Pattern.compile("^([0-9]{4}[- ]){3}[0-9]{4}$");
        Matcher matcher3 = pattern3.matcher("1241-5658-9212-3556");
        boolean isMatch3 = matcher3.matches();
        System.out.println(isMatch3);
    }
}