package ss4.thuc_hanh;
import java.util.Scanner;

public class MainQuanLySinhVien {
    public static void main(String[] args) {
        QuanLySinhVien quanLy = new QuanLySinhVien(10);
        SinhVien sinhVien1 = new SinhVien(1,"Nguyên", "Nguyen@gmail.com","0982775131",5);
        quanLy.themSinhVien(sinhVien1);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Menu quản lý: ");
            System.out.println("1. Thêm Sinh Viên.");
            System.out.println("2. Sửa Sinh Viên.");
            System.out.println("3. Xóa Sinh Viên.");
            System.out.println("4. Hiển Thị Sinh Viên.");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin của sinh viên:");
                    System.out.print("Mã SV: ");
                    int maSV = scanner.nextInt();
                    System.out.print("Tên SV: ");
                    String tenSV = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("SĐT: ");
                    String sdt = scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpa = scanner.nextDouble();
                    SinhVien sinhVien = new SinhVien(maSV, tenSV, email, sdt, gpa);
                    quanLy.themSinhVien(sinhVien);
                    break;
                case 2:
                    System.out.println("Nhập mã SV của sinh viên cần sửa: ");
                    int maSVCanSua = scanner.nextInt();
                    quanLy.suaSinhVien(maSVCanSua);
                    break;
                case 3:
                    System.out.println("Nhập mã SV của sinh viên cần xóa: ");
                    int maSVCanXoa = scanner.nextInt();
                    scanner.nextLine();
                    quanLy.xoaSinhVien(maSVCanXoa);
                    break;
                case 4:
                    quanLy.hienThiDanhSachSinhVien();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

class SinhVien {
    private int maSV;
    private String tenSV;
    private String email;
    private String sdt;
    private double GPA;

    public SinhVien(int maSV, String tenSV, String email, String sdt, double GPA) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.sdt = sdt;
        this.GPA = GPA;
    }

    public String toString() {
        return "Mã SV: " + maSV + ", Tên SV: " + tenSV + ", Email: " + email + ", SĐT: " + sdt + ", GPA: " + GPA;
    }

    public int getMaSV() {
        return maSV;
    }
}

class QuanLySinhVien {
    private SinhVien[] quanLySinhVien;
    private int limit;
    private int size;

    public QuanLySinhVien(int limit) {
        this.quanLySinhVien = new SinhVien[limit];
        this.limit = limit;
        this.size = 0;
    }

    public void themSinhVien(SinhVien sinhVien) {
        if (size < limit) {
            quanLySinhVien[size] = sinhVien;
            size++;
            System.out.println("Sinh viên đã được thêm vào danh sách.");
        } else {
            System.out.println("Danh sách sinh viên đã đầy, không thể thêm mới.");
        }
    }

    public void hienThiDanhSachSinhVien() {
        if (size == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (int i = 0; i < size; i++) {
                System.out.println(quanLySinhVien[i].toString());
            }
        }
    }

    public void suaSinhVien(int maSV) {
        boolean kiemTra = false;
        for (int i = 0; i < size; i++) {
            if (quanLySinhVien[i].getMaSV() == maSV) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập thông tin mới cho sinh viên:");
                System.out.print("Tên SV: ");
                String tenSV = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("SĐT: ");
                String sdt = scanner.nextLine();
                System.out.print("GPA: ");
                double gpa = scanner.nextDouble();
                quanLySinhVien[i] = new SinhVien(maSV, tenSV, email, sdt, gpa);
                kiemTra = true;
                System.out.println("Sửa thông tin sinh viên thành công.");
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("Không tìm thấy sinh viên có mã số " + maSV);
        }
    }

    public void xoaSinhVien(int maSV) {
        boolean kiemTra = false;
        for (int i = 0; i < size; i++) {
            if (quanLySinhVien[i].getMaSV() == maSV) {
                for (int j = i; j < size - 1; j++) {
                    quanLySinhVien[j] = quanLySinhVien[j + 1];
                }
                size--;
                kiemTra = true;
                System.out.println("Xóa sinh viên thành công.");
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("Không tìm thấy sinh viên có mã số " + maSV);
        }
    }
}
