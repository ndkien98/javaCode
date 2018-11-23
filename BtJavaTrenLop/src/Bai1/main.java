package Bai1;

public class main {
    public static void main(String [] a){
       PhanSo ps1 = new PhanSo(2,4);
       PhanSo ps2 = new PhanSo(3,5);
        System.out.println("Tổng 2 phân số : "+ps1.congPS(ps2));
        System.out.println("Hiệu 2 phân số : "+ps1.truPS(ps2));
        System.out.println("Tích 2 phân số : "+ps1.tichPS(ps2));
        System.out.println("Thướng 2 phân số : "+ps1.thuongPS(ps2));

        ps1.timDangTG();
        ps2.timDangTG();
    }
}
