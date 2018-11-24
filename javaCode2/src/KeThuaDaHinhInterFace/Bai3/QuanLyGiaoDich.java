package KeThuaDaHinhInterFace.Bai3;

import java.util.Scanner;

public class QuanLyGiaoDich {

    private GiaoDich [] giaoDiches;
    private int count;

    private final int GIAO_DICH_VANG =1;
    private final int GIAO_DICH_TIEN_TE =2;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public QuanLyGiaoDich(int count){
        this.count = count;
        this.giaoDiches = new GiaoDich[190];
    }

    public void nhap(){
        for (int i = 0; i <this.count ; i++) {
            System.out.println("Nhập vào loại giao dịch");
            System.out.println("1 : Giao dịch vàng ");
            System.out.println("2 : Giao dich tiền");
            int n= new Scanner(System.in).nextInt();
            switch (n){
                case GIAO_DICH_VANG :
                    giaoDiches[i] = new GiaoDichVang();
                    giaoDiches[i].nhap();
                    break;
                case GIAO_DICH_TIEN_TE :
                    giaoDiches[i] = new GiaoDichTienTe();
                    giaoDiches[i].nhap();
                    break;
            }
        }
    }

    public void xuat(){
        for (GiaoDich g:giaoDiches
             ) {
            if (g instanceof GiaoDichTienTe){
                g.xuat();
            }else if (g instanceof GiaoDichVang){
                g.xuat();
            }
        }
    }

    public void tinhTongTungLoai(){
        int gdv=0,gdtt=0;
        for (GiaoDich g:giaoDiches
             ) {
            if (g instanceof GiaoDichTienTe){
                gdtt++;
            }else if (g instanceof GiaoDichVang){
                gdv++;
            }
        }

        System.out.println("Tổng giao dịch vàng "+gdv);
        System.out.println("Tổng giao dịch tiền tệ"+gdtt);
    }




}
