package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB implements IQLCB {

    List<CanBo> list;

    public QLCB (){
        list = new ArrayList<CanBo>();
    }


    @Override
    public void Nhap() {
        int n;
        System.out.println("Nhập vào số lượng cán bộ");
        n = new Scanner(System.in).nextInt();
        for (int i=0;i<n;i++){
            CanBo canBo = null;
            System.out.println("Cán bộ bạn muốn nhập là : ");
            System.out.println("1 : Công nhân");
            System.out.println("2 : Kỹ sư");
            System.out.println("3 : Nhân viên phục vụ");
            int x = new Scanner(System.in).nextInt();
            switch (x){
                case 1 : {
                    canBo = new CongNhan();
                    canBo.Nhap();
                    break;
                }case 2 : {
                    canBo = new KySu();
                    canBo.Nhap();
                    break;
                }case 3 :{
                    canBo = new NVPhucVu();
                    canBo.Nhap();
                    break;
                }default:
                    System.out.println("Bạn đã chọn số không hợp lệ");
                    break;
            }
            list.add(canBo);

        }
    }

    public void Xuat(){
        for (CanBo c:list
             ) {
            c.Xuat();
        }
    }

    @Override
    public void timTheoHoTen(String hoten) {
        for (CanBo c:list
             ) {
            if(c.getHoTen().equals(hoten)){
                System.out.println("Thông tin cảu cán bộ tìm được là ");
                c.Xuat();
            }
        }
    }

    @Override
    public void hienThiTT() {

    }

    public static void main(String [] a){
        QLCB qlcb = new QLCB();
        qlcb.Nhap();
        qlcb.Xuat();
        System.out.println("Nhập vào tên muốn tìm");
        String c = new Scanner(System.in).nextLine();
        qlcb.timTheoHoTen(c);

       /* CanBo canBo = new CongNhan();
        canBo.Nhap();
        canBo.Xuat();
*/
    }

}
