package Bai3;

import java.util.Scanner;

public class TaiLieu {
    private String id ;
    private String tenNXB;
    private int soBanPhatHanh;

    public TaiLieu(String id, String tenNXB, int soBanPhatHanh) {
        this.id = id;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu(int i, String kien, int soBanPhatHanh){

    }

    public TaiLieu() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id='" + id + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }

    public void Nhap(){
        System.out.println("Mã tài liệu : ");
        this.id= new Scanner(System.in).nextLine();
        System.out.println("Nhập tên NXB :");
        this.tenNXB = new Scanner(System.in).nextLine();
        try {
            System.out.println("Nhập số bản phát hành :");
            this.soBanPhatHanh = new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Định dạng số bản phát hành sai ");
        }



    }

    public void Xuat(){
        System.out.println(this.toString());
    }



}
