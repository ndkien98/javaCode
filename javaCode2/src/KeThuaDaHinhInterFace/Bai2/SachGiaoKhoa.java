package KeThuaDaHinhInterFace.Bai2;

import java.util.Date;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {

    private int tinhTrang;
    private final int SACH_CU =1;
    private final int SACH_MOI = 2;

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSACH_CU() {
        return SACH_CU;
    }

    public int getSACH_MOI() {
        return SACH_MOI;
    }

    public SachGiaoKhoa(String id, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, int tinhTrang) {
        super(id, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập tình trang sách : ");
        System.out.println("1 : Sách cũ ");
        System.out.println("2 : Sách mới ");
        this.tinhTrang = new Scanner(System.in).nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        if (this.tinhTrang==SACH_CU){
            System.out.println("Tình trạng sách cũ ");
        }else if (this.tinhTrang ==SACH_MOI){
            System.out.println("Tình trạng sách mới ");
        }
    }

    @Override
    public double tinhThanhTien() {
        if (this.tinhTrang == SACH_CU) {
            return this.getSoLuong() * this.getDonGia() * 0.5;
        }
        return this.getSoLuong() * this.getDonGia();
    }
}
