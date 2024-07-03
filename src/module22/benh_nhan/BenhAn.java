package module22.benh_nhan;

    import java.time.LocalDate;

    public abstract class BenhAn {
        protected int soThuTuBenhAn;
        protected String maBenhAn;
        protected String maBenhNhan;
        protected String tenBenhNhan;
        protected LocalDate ngayNhapVien;
        protected LocalDate ngayRaVien;
        protected String lyDoNhapVien;

        public BenhAn(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien) {
            this.soThuTuBenhAn = soThuTuBenhAn;
            this.maBenhAn = maBenhAn;
            this.maBenhNhan = maBenhNhan;
            this.tenBenhNhan = tenBenhNhan;
            this.ngayNhapVien = ngayNhapVien;
            this.ngayRaVien = ngayRaVien;
            this.lyDoNhapVien = lyDoNhapVien;
        }

        public int getSoThuTuBenhAn() {
            return soThuTuBenhAn;
        }

        public void setSoThuTuBenhAn(int soThuTuBenhAn) {
            this.soThuTuBenhAn = soThuTuBenhAn;
        }

        public String getMaBenhAn() {
            return maBenhAn;
        }

        public void setMaBenhAn(String maBenhAn) {
            this.maBenhAn = maBenhAn;
        }

        public String getMaBenhNhan() {
            return maBenhNhan;
        }

        public void setMaBenhNhan(String maBenhNhan) {
            this.maBenhNhan = maBenhNhan;
        }

        public String getTenBenhNhan() {
            return tenBenhNhan;
        }

        public void setTenBenhNhan(String tenBenhNhan) {
            this.tenBenhNhan = tenBenhNhan;
        }

        public LocalDate getNgayNhapVien() {
            return ngayNhapVien;
        }

        public void setNgayNhapVien(LocalDate ngayNhapVien) {
            this.ngayNhapVien = ngayNhapVien;
        }

        public LocalDate getNgayRaVien() {
            return ngayRaVien;
        }

        public void setNgayRaVien(LocalDate ngayRaVien) {
            this.ngayRaVien = ngayRaVien;
        }

        public String getLyDoNhapVien() {
            return lyDoNhapVien;
        }

        public void setLyDoNhapVien(String lyDoNhapVien) {
            this.lyDoNhapVien = lyDoNhapVien;
        }

        public abstract String loaiBenhAn();
    }
