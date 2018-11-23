package Bai2;

import java.util.Scanner;

public class KySu extends CanBo implements ICanBo {
    private String nghanhDT;

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nghanhDT) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nghanhDT = nghanhDT;
    }

    public KySu(String nghanhDT) {
        this.nghanhDT = nghanhDT;
    }

    public KySu() {
    }

    public String getNghanhDT() {
        return nghanhDT;
    }

    public void setNghanhDT(String nghanhDT) {
        this.nghanhDT = nghanhDT;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nghanhDT='" + nghanhDT + '\'' +
                '}';
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập nghành đào tạo");
        this.nghanhDT = new Scanner(System.in).nextLine();
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }
}
