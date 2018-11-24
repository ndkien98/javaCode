package KeThuaDaHinhInterFace.Bai1;

import java.util.Scanner;

public class QLX {

    private ChuyenXe [] chuyenXes;
    private int count;
    private final int XE_NOI_THANH =1;
    private final int XE_NGOAI_THANH=2;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public QLX(int n){
        this.count = n;
        this.chuyenXes = new ChuyenXe[30];
    }

    public void nhap(){
        for (int i = 0; i <this.count ; i++) {
            System.out.println("Loại xe muốn nhập :");
            System.out.println("1 : Xe nội thành ");
            System.out.println("2 : Xe ngoại thành ");
            int n = new Scanner(System.in).nextInt();
            if (n==XE_NOI_THANH){
                chuyenXes[i] = new XeNoiThanh();
                chuyenXes[i].nhap();
            }else if (n== XE_NGOAI_THANH){
                chuyenXes[i] = new XeNgoaiThanh();
                chuyenXes[i].nhap();
            }
        }
    }

    public void xuat(){
        for (ChuyenXe c:chuyenXes
             ) {
            if (c instanceof XeNoiThanh){
                c.xuat();
            }else if (c instanceof XeNgoaiThanh){
                c.xuat();
            }
        }
    }

    public void tongDT(){
        double xnoit=0,xngoaithanh=0;
        for (ChuyenXe c:chuyenXes
        ) {
            if (c instanceof XeNoiThanh){
                xnoit+=c.getDoanhThu();
            }else if (c instanceof XeNgoaiThanh){
                xngoaithanh+=c.getDoanhThu();
            }
        }

        System.out.println("Tổng doanh thu xe nội thành:"+xnoit);
        System.out.println("Tổng doanh thu xe ngoại thành :"+xngoaithanh);
    }



}
