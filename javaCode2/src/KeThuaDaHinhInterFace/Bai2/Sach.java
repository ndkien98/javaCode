package KeThuaDaHinhInterFace.Bai2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Sach {

    private String id;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach(String id, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach(){

    }

    public void nhap(){
        System.out.println("Nhập mã sách ");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Ngày nhập sách : ");
        String ngay = new Scanner(System.in).nextLine();

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

        try {
            this.ngayNhap = dateFormat.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Nhập đơn giá :");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng sách : ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào nhà xuất bản :");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
    }

    public void xuat(){
        System.out.println("Id : "+id);
        System.out.println("Ngày nhập : "+ngayNhap);
        System.out.println("Đơn giá :"+donGia);
        System.out.println("Số lượng sách "+soLuong);
        System.out.println("Nhà xuất bản :"+nhaXuatBan);
    }

    public abstract double tinhThanhTien();

}
