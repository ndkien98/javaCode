package KeThuaDaHinhInterFace.Bai2;

import java.util.Scanner;

public class QuanLySach {

    private Sach [] saches ;
    private int count ;
    private final int SACH_GIAO_KHOA =1;
    private final int SACH_THAM_KHAO =2;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public QuanLySach(int count){
        this.count = count;
        this.saches = new Sach[10];
    }

    public void nhap(){
        for (int i = 0; i <this.count ; i++) {
            System.out.println("Nhập vào loại sách :");
            System.out.println("1 : Sách giáo khoa ");
            System.out.println("2 : Sách tham khảo ");
            int n = new Scanner(System.in).nextInt();
            switch (n){
                case SACH_GIAO_KHOA:
                    System.out.println("Nhập thông tin sách giáo khoa ");
                    saches[i] = new SachGiaoKhoa();
                    saches[i].nhap();
                    break;
                case SACH_THAM_KHAO :
                    System.out.println("Nhập thông tin sách tham khảo ");
                    saches[i] = new SachThamKhao();
                    saches[i].nhap();
                    break;
                default:
                    System.out.println("chọn nữa chưa đúng ");
                    break;
            }
        }
    }

    public void xuat(){
        for (Sach s:saches
             ) {
            if (s instanceof SachGiaoKhoa){
                s.xuat();
            }else if (s instanceof SachThamKhao) s.xuat();
        }
    }

    public void tinhTongTungLoai(){
        double sgk=0,stk=0;
        for (Sach s:saches
             ) {
            if (s instanceof SachGiaoKhoa){
                sgk+=s.tinhThanhTien();
            }else if (s instanceof SachThamKhao) stk+=s.tinhThanhTien();
        }

        System.out.println("Tổng thành tiền sách giáo khoa "+sgk);
        System.out.println("Tổng thành tiền sách tham khảo "+stk);
    }

    public void tinhTBCDonGia(){
        double tbc=0,n=0;

        for (Sach s:saches
             ) {
            if (s instanceof SachThamKhao){
                n++;
                tbc+=s.getDonGia();
            }
        }
        System.out.println("Tổng trung bình cộng đơn giá "+tbc/n);
    }

    public void xuatSachTheoTen(String name){
        for (Sach s:saches
             ) {
            if (s.getNhaXuatBan().equals(name)){
                s.xuat();
            }
        }
    }

}
