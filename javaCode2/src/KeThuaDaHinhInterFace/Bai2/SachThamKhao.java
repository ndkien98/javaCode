package KeThuaDaHinhInterFace.Bai2;

import java.util.Date;
import java.util.Scanner;

public class SachThamKhao extends Sach {

    private double thue;

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public SachThamKhao(String id, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(id, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public SachThamKhao(double thue) {
        this.thue = thue;
    }

    public SachThamKhao() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập thuế :");
        this.thue = new Scanner(System.in).nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thuế :"+thue);
    }



    @Override
    public double tinhThanhTien() {
        return this.getSoLuong()*this.getDonGia()+this.getThue();
    }
}
