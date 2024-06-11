package zBaiTapVeNha.ss4;

import java.util.Scanner;

public class MainQuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien quanLy = new QuanLySinhVien(10);
        SinhVien sv1 = new SinhVien(1, "Nguyen", "Nguyen@gmail.com", "0982775131", 6);
        SinhVien sv2 = new SinhVien(2, "Quyet", "Quyet@gmail.com", "0909090909", 7);
        quanLy.themSinhVien(sv1);
        quanLy.themSinhVien(sv2);
        while (true) {
            System.out.println("Menu Quản Lý Sinh Viên");
            System.out.println("1. Thêm Sinh Viên");
            System.out.println("2. Sửa Sinh Viên");
            System.out.println("3. Xóa Sinh Viên");
            System.out.println("4. Hiển Thị Sinh Viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Mã Sinh Viên: ");
                    int maSV = sc.nextInt();
                    System.out.print("Tên Sinh Viên: ");
                    String tenSV = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Số Điện Thoại: ");
                    String sdt = sc.next();
                    System.out.print("Điểm: ");
                    double GPA = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSV, tenSV, email, sdt, GPA);
                    quanLy.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("Nhập Mã SV cần sửa: ");
                    int maSVCanSua = sc.nextInt();
                    quanLy.suaSinhVien(maSVCanSua);
                    break;
                case 3:
                    System.out.println("Nhập Mã SV cần xóa: ");
                    int maSVCanXoa = sc.nextInt();
                    quanLy.xoaSinhVien(maSVCanXoa);
                    break;
                case 4:
                    quanLy.hienThiSinhVien();
                    break;
                case 5:
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

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, String email, String sdt, double GPA) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.sdt = sdt;
        this.GPA = GPA;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return "Mã SV:  " + this.maSV + ", Tên SV: " + this.tenSV + ", Email: " + this.email + ", SDT: " + this.sdt + ", Điểm: " + this.GPA;
    }
}

class QuanLySinhVien {
    private SinhVien[] quanLySinhVien;
    private int limit;
    private int size;

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(int limit) {
        this.quanLySinhVien = new SinhVien[limit];
        this.limit = limit;
        this.size = 0;
    }

    public void themSinhVien(SinhVien sv) {
        if (size < limit) {
            quanLySinhVien[size] = sv;
            size++;
            System.out.println("Them moi thanh cong sinh vien: ");
        } else {
            System.out.println("Danh sach sinh vien da day");
        }
    }

    public void hienThiSinhVien() {
        if (size == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sach sinh vien");
            for (int i = 0; i < size; i++) {
                System.out.println(quanLySinhVien[i].toString());
            }
        }
    }

    public void suaSinhVien(int maSVCanSua) {
        boolean kiemTra = false;
        for (int i = 0; i < size; i++) {
            if (quanLySinhVien[i].getMaSV() == maSVCanSua) {
                Scanner sc = new Scanner(System.in);
                kiemTra = true;
                System.out.print("Tên Sinh Viên: ");
                String tenSV = sc.next();
                System.out.print("Email: ");
                String email = sc.next();
                System.out.print("Số Điện Thoại: ");
                String sdt = sc.next();
                System.out.print("Điểm: ");
                double GPA = sc.nextDouble();
                quanLySinhVien[i] = new SinhVien(maSVCanSua, tenSV, email, sdt, GPA);
                System.out.println("Sửa thành công");
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("Mã SV không hợp lệ: ");
        }
    }

    public void xoaSinhVien(int maSVCanXoa) {
        boolean kiemTra = false;
        for (int i = 0; i < size; i++) {
            if (quanLySinhVien[i].getMaSV() == maSVCanXoa) {
                for (int j = i; j < size - 1; j++) {
                    quanLySinhVien[j] = quanLySinhVien[j + 1];
                }
                kiemTra = true;
                System.out.println("Xóa thành công");
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("Mã SV không hợp lệ: ");
        }
    }
}
