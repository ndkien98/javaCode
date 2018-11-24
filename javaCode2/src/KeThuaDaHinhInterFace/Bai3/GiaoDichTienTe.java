package KeThuaDaHinhInterFace.Bai3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{


    private double tiGia;
    private int loaiTien;

    private final int TIEN_VIET_NAM =1;
    private final int TIEN_USD =2 ;
    private final int TIEN_EURO =3;

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(int loaiTien) {
        this.loaiTien = loaiTien;
    }

    public int getTIEN_VIET_NAM() {
        return TIEN_VIET_NAM;
    }

    public int getTIEN_USD() {
        return TIEN_USD;
    }

    public int getTIEN_EURO() {
        return TIEN_EURO;
    }

    public GiaoDichTienTe(String id, Date ngayGD, double donGia, int soLuong, double tiGia, int loaiTien) {
        super(id, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public GiaoDichTienTe(double tiGia, int loaiTien) {
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public GiaoDichTienTe(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập tỉ giá :");
        this.tiGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập loại tiền giao dịch ");
        System.out.println("1 : Tiền Việt Nam");
        System.out.println("2 : Tiền USD");
        System.out.println("3 : Tiền Euro");
        this.loaiTien = new Scanner(System.in).nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tỉ giá :"+tiGia);
        switch (this.loaiTien){
            case TIEN_VIET_NAM :
                System.out.println("Loại tiền : Việt Nam đồng ");
                break;
            case TIEN_USD :
                System.out.println("Loại tiền : USD");
                break;
            case TIEN_EURO :
                System.out.println("Loại tiền : Euro");
                break;
        }
    }

    @Override
    public double tinhThanhTien() {
        return (this.loaiTien==TIEN_USD||this.loaiTien==TIEN_EURO) ? (this.getSoLuong()*this.getDonGia()*this.tiGia):(this.getSoLuong()*this.getDonGia());
    }
}
