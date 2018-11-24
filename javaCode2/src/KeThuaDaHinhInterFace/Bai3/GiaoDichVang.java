package KeThuaDaHinhInterFace.Bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {

    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String id, Date ngayGD, double donGia, int soLuong, String loaiVang) {
        super(id, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Loại vàng :");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loại vàng "+loaiVang);
    }

    @Override
    public double tinhThanhTien() {
        return this.getSoLuong()*this.getDonGia();
    }
}
