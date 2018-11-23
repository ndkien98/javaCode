package BaiTH3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {

    ArrayList<Student> listSudent;

    public QLHS (){
        listSudent = new ArrayList<>();
    }

    public void addStuden(Student student){
        for (Student s:listSudent
             ) {
            if(s.getId().equals(student.getId())){
                System.out.println("Học sinh đã tồn tại trong danh sách ");

            }
            listSudent.add(student);
            System.out.println("Đã thêm thành công");
        }
    }

    public void Nhap(){
        System.out.println("Nhập vào số học sinh muốn nhập");
        int n = new Scanner(System.in).nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Nhập vào thông tin sinh viên thứ "+n+1);
            Student student = new Student();
            student.Nhap();
            listSudent.add(student);
        }
    }

    public void Xuat(){
        System.out.println("Thông tin sinh viên ");
        for (Student s:listSudent
             ) {
            s.Xuat();
        }
    }

    public void timHocSinh(String lop ,String queQuan){
        for (Student s:listSudent
             ) {
            if(s.getQueQuan().equals(queQuan)&&s.getLop().equals(lop)){
                System.out.println("Thông tin sinh viên cần tifm là ");
                s.Xuat();
            }
        }
        System.out.println("Không có sinh viên cần tìm trong danh sách ");
    }
};


