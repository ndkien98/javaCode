package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTL {
    List<TaiLieu> taiLieuList ;

    public QLTL(){
        taiLieuList = new ArrayList<TaiLieu>();
    }


    public void inPut(){
        System.out.println("Nhập vào số lượng tài lieeji :");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            TaiLieu taiLieu;
            System.out.println("Loại tài liệu muốn nhập : ");
            System.out.println("1 : Sách ");
            System.out.println("2 : Tạp chí ");
            System.out.println("3 : Báo ");
            int L = new Scanner(System.in).nextInt();
            switch (L){
                case (1) :
                    taiLieu = new Sach();
                    taiLieu.Nhap();
                    taiLieuList.add(taiLieu);
                    break;
                case (2) :
                    taiLieu = new TapChi();
                    taiLieu.Nhap();
                    taiLieuList.add(taiLieu);
                    break;
                case (3) :
                    taiLieu = new Bao();
                    taiLieu.Nhap();
                    taiLieuList.add(taiLieu);
                    break;
                default:
                    System.out.println("Chọn số chưa hợp lệ ");
                    break;
            }

        }
    }

    public void outPut(){
        for (TaiLieu t:taiLieuList
             ) {
            if(t instanceof Sach){
                t.Xuat();
            }else if (t instanceof TapChi){
                t.Xuat();
            }else if (t instanceof Bao){
                t.Xuat();
            }
        }
    }

    public void timTL(){
        System.out.println("Nhập mã tài liệu muốn tìm :");
        String m = new Scanner(System.in).nextLine();
        for (TaiLieu t:taiLieuList
             ) {
            if(t.equals(m)){
                System.out.println("Thông tin tài liệu cần tìm :");
                t.Xuat();
            }
            System.out.println("Tài liệu cần tìm không tồn tại ");

        }
    }

}
