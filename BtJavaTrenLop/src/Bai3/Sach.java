package Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTG ;
    private int soTrang;

    public Sach(String id, String tenNXB, int soBanPhatHanh, String tenTG, int soTrang) {
        super(id, tenNXB, soBanPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(int i, String kien, int soBanPhatHanh, String tenTG, int soTrang) {
        super(i, kien, soBanPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(String tenTG, int soTrang) {
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(){

    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTG='" + tenTG + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập tên tác giả :");
        this.tenTG = new Scanner(System.in).nextLine();
        System.out.println("Nhập số trang :");
        this.soTrang = new Scanner(System.in).nextInt();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }

}
