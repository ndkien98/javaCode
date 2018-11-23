package BaiTH3;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Student extends Nguoi {
    private String id;
    private String lop;
    private String khoaHoc ;
    private String hocKy;

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public Student(String hoTen, Date ngaySinh, String queQuan, String lop, String khoaHoc, String hocKy) {
        super(hoTen, ngaySinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.hocKy = hocKy;
    }

    public Student(){


    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", hocKy='" + hocKy + '\'' +
                '}';
    }

    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập vào id");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập lớp : ");
        this.lop= new Scanner(System.in).nextLine();
        System.out.println("Nhập khóa học");
        this.khoaHoc= new Scanner(System.in).nextLine();
        System.out.println("Nhập vào học kỳ ");
        this.hocKy = new Scanner(System.in).nextLine();

    }

    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }

}
