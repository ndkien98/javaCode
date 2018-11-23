package BaiTH3;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String HoTen;
    private Date NgaySinh;
    private String QueQuan;


    public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        QueQuan = queQuan;
    }

    public Nguoi(){

    }

    public String getHoTen() {
        return HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {

    }

    public void Nhap(){
        System.out.println("Nhập tên : ");
        this.HoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào Ngày tháng năm sinh ");
        try{
            String date = new Scanner(System.in).nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            this.NgaySinh=dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap vào quê quán ");
        this.QueQuan = new Scanner(System.in).nextLine();

    }


    @Override
    public String toString() {
        return "Nguoi{" +
                "HoTen='" + HoTen + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", QueQuan='" + QueQuan + '\'' +
                '}';
    }

    public void Xuat(){
        System.out.println(this.toString());
    }


}
