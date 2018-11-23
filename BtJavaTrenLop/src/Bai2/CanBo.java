package Bai2;

import java.util.Scanner;

public class CanBo implements ICanBo {

    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public CanBo() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public void Nhap() {
        System.out.println("Nhập tên cán bộ :");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày sinh casn bộ");
        this.ngaySinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập giới tính :");
        this.gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ : ");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public void Xuat() {
        System.out.println("Họ tên :"+this.hoTen);
        System.out.println("Ngày sinh : "+ngaySinh);
        System.out.println("giới tính :"+gioiTinh);
        System.out.println("Địa chỉ :"+diaChi); // hàm xuất dùng toString không được
    }
}
