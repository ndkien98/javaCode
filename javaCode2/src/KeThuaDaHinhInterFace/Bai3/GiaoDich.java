package KeThuaDaHinhInterFace.Bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich implements IGiaoDich {

    private String id;
    private Date ngayGD;
    private double donGia;
    private int soLuong;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
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

    public GiaoDich(String id, Date ngayGD, double donGia, int soLuong) {
        this.id = id;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public GiaoDich(){

    }

    public void nhap(){
        System.out.println("Nhập id :"+id);
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày giao dịch");
        String ngay = new Scanner(System.in).nextLine();

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngayGD = dateFormat.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập đơn giá ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng ");
        this.soLuong = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        System.out.println("id :"+id);
        System.out.println("Ngày giao dịch"+ngayGD);
        System.out.println("Đơn giá "+donGia);
        System.out.println("Số lượng "+soLuong);
    }

}
