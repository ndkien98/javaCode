package KeThuaDaHinhInterFace.Bai1;

import java.util.Scanner;

public class XeNoiThanh extends ChuyenXe {

    private int soTuyen;
    private int soKM;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public XeNoiThanh(String id, String name, int soXe, double doanhThu, int soTuyen, int soKM) {
        super(id, name, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public XeNoiThanh(int soTuyen, int soKM) {
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public XeNoiThanh(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số tuyến :");
        this.soTuyen = new Scanner(System.in).nextInt();
        System.out.println("Số km đi được ");
        this.soKM = new Scanner(System.in).nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số tuyến :"+soTuyen);
        System.out.println("Số km đi được"+soKM);
    }

    @Override
    public double tongDoanhThu() {
        return soKM*this.getDoanhThu();
    }
}
