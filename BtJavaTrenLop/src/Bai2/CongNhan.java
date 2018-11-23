package Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo implements ICanBo{
    private String bacCN;

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bacCN) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bacCN = bacCN;
    }

    public CongNhan(String bacCN) {
        this.bacCN = bacCN;
    }

    public CongNhan(){

    }

    public String getBacCN() {
        return bacCN;
    }

    public void setBacCN(String bacCN) {
        this.bacCN = bacCN;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bacCN='" + bacCN + '\'' +
                '}';
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập vào bậc công nhân");
        this.bacCN  = new Scanner(System.in).nextLine();
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println(this.toString());
    }



}
