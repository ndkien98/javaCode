package Bai2;

import java.util.Scanner;

public class NVPhucVu extends CanBo implements ICanBo{
    private String congViec;

    public NVPhucVu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NVPhucVu(String congViec) {
        this.congViec = congViec;
    }

    public NVPhucVu() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NVPhucVu{" +
                "congViec='" + congViec + '\'' +
                '}';
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập công việc : ");
        this.congViec = new Scanner(System.in).nextLine();
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }
}
