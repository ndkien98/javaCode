package KeThuaDaHinhInterFace.Bai1;

import java.util.Scanner;

public class XeNgoaiThanh extends ChuyenXe {

    private String noiDen;
    private int soNgayDi;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public XeNgoaiThanh(String id, String name, int soXe, double doanhThu, String noiDen, int soNgayDi) {
        super(id, name, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public XeNgoaiThanh(String noiDen, int soNgayDi) {
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public XeNgoaiThanh(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số ngày đi :");
        this.soNgayDi = new Scanner(System.in).nextInt();
        System.out.println("Nhập nơi đến :");
        this.noiDen = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số ngày đi :"+soNgayDi);
        System.out.println("Nơi đến : "+noiDen);
    }

    @Override
    public double tongDoanhThu() {
        return this.soNgayDi*this.getDoanhThu();
    }
}
