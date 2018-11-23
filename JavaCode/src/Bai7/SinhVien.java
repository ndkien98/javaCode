package Bai7;

import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private String address;
    private String sdt;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public SinhVien() {
        this.sdt = "0123456";
    }

    public SinhVien(int id, String name, String address, String sdt) {
        this.id = id;
        this.name = name;
        this.address = address;
        if (sdt.length()!=7){
            sdt = "0123456";
        }else {
            this.sdt = sdt;
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }

    public void Nhap(){
        System.out.println("Nhập mã sinh viên:  ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhap ten sinh vien  ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhap vao dia chi sinh vien : ");
        this.address = new Scanner(System.in).nextLine();
        do {
            System.out.println("Nhap vao sdt sinh vien ");
            this.sdt = new Scanner(System.in).nextLine();
        }while (sdt.length()!=7);

    }

    public void Xuat(){
        System.out.println(this.toString());
    }


}
