package KeThuaDaHinhInterFace.Bai1;

import java.util.Scanner;

public abstract class ChuyenXe {
    private String id;
    private String name;
    private int soXe;
    private double doanhThu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public ChuyenXe(String id, String name, int soXe, double doanhThu) {
        this.id = id;
        this.name = name;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public ChuyenXe(){

    }

    public void nhap(){
        System.out.println("Nhập id :");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên xe:");
        this.name =new Scanner(System.in).nextLine();
        System.out.println("Nhập số xe :");
        this.soXe = new Scanner(System.in).nextInt();
        System.out.println("Nhập doanh thu :");
        this.doanhThu = new Scanner(System.in).nextDouble();

    }

    public void xuat(){
        System.out.println("Id :"+id);
        System.out.println("Tên xe :"+name);
        System.out.println("Số xe :"+soXe);
        System.out.println("Doanh thu :"+doanhThu);
    }

    public abstract double tongDoanhThu();
    /*
        để cho đúng tư duy . các class con vẫn có thể dùng theo tùy ý

     */
}
