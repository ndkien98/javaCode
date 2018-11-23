package Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    public TapChi(){

    }

    public TapChi(String id, String tenNXB, int soBanPhatHanh, int soPH, int thangPH) {
        super(id, tenNXB, soBanPhatHanh);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public TapChi(int i, String kien, int soBanPhatHanh, int soPH, int thangPH) {
        super(i, kien, soBanPhatHanh);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public TapChi(int soPH, int thangPH) {
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập số phát hành : ");
        this.soPH = new Scanner(System.in).nextInt();
        System.out.println("Nhập tháng phát hành : ");
        this.thangPH = new Scanner(System.in).nextInt();

    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPH=" + soPH +
                ", thangPH=" + thangPH +
                '}';
    }

    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }




}
