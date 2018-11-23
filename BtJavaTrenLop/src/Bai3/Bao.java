package Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayPH;

    public Bao(String id, String tenNXB, int soBanPhatHanh, String ngayPH) {
        super(id, tenNXB, soBanPhatHanh);
        this.ngayPH = ngayPH;
    }

    public Bao(int i, String kien, int soBanPhatHanh, String ngayPH) {
        super(i, kien, soBanPhatHanh);
        this.ngayPH = ngayPH;
    }

    public Bao(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Bao(){

    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập ngày phát hành : ");
        this.ngayPH = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPH='" + ngayPH + '\'' +
                '}';
    }
    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }




}
