package Bai8;

import java.util.Scanner;

public class CD {

    private int id;
    private String title;
    private String singerName;
    private int number;
    private int money;

    public CD(int id, String title, String singName, int number, int money) {
        this.id = id;
        this.title = title;
        this.singerName = singName;
        this.number = number;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSingName() {
        return singerName;
    }

    public int getNumber() {
        return number;
    }

    public int getMoney() {
        return money;
    }

    public CD() {
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", singName='" + singerName + '\'' +
                ", number=" + number +
                ", money=" + money +
                '}';
    }

    public void Nhap(){
        System.out.println("Nhập vào mã CD : ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tên CD : ");
        this.title = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào tên ca sĩ ");
        this.singerName = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số bài hát :");
        this.number = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào giá thành :  ");
        this.money = new Scanner(System.in).nextInt();
    }

    public void Xuat(){
        System.out.println(this.toString());
    }

}
