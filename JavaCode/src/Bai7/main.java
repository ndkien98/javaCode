package Bai7;

public class main {

    public static void main(String[] args) {

        SinhVien [] sinhViens = new SinhVien[5];

        for (int i = 0;i<5;i++){
            System.out.println("Nhap vao sinh vien thu "+i);
            sinhViens[i] = new SinhVien();
            sinhViens[i].Nhap();
        }



        for (int i=0;i<5;i++){
            for (int j=i+1;j<sinhViens.length;j++){
                if(sinhViens[i].getId()>sinhViens[j].getId()){
                    SinhVien sinhVien = sinhViens[i];
                    sinhViens[i]= sinhViens[j];
                    sinhViens[j]= sinhVien;
                }
            }

        }

        for (int i=0;i<sinhViens.length;i++){
            sinhViens[i].Xuat();
        }

    }

}
