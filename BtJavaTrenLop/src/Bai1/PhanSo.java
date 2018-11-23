package Bai1;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){

    }

    public PhanSo(int tuso,int mauso){
        this.tuSo=tuso;
        this.mauSo=mauso;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return tuSo+"/"+mauSo;
    }

    public PhanSo congPS(PhanSo a){
        PhanSo Tong = new PhanSo();
        Tong.tuSo=this.tuSo*a.mauSo+a.tuSo*this.mauSo;
        Tong.mauSo=this.mauSo*a.mauSo;
        return Tong;
    }

    public PhanSo truPS(PhanSo a){
        PhanSo Hieu = new PhanSo();
        Hieu.tuSo=this.tuSo*a.mauSo-a.tuSo*this.mauSo;
        Hieu.mauSo=this.mauSo*a.mauSo;
        return Hieu;
    }

    public PhanSo tichPS(PhanSo a){
        PhanSo Tich = new PhanSo();
        Tich.tuSo = this.tuSo*a.tuSo;
        Tich.mauSo = this.mauSo*a.mauSo;
        return Tich;
    }

    public PhanSo thuongPS(PhanSo a){
        PhanSo Thuong = new PhanSo();
        Thuong.tuSo=this.tuSo*a.mauSo;
        Thuong.mauSo=this.mauSo*a.tuSo;
        return Thuong;
    }

    public int ucln(int a,int b){
        return (b==0)?a:ucln(b,a%b);
    }

    public boolean ktToiGian(){
        if(ucln(this.tuSo,this.mauSo)>=2) return false;
        return true;
    }

    public void timDangTG(){
        if(this.ktToiGian()){
            System.out.println("Phân số đã là dạng tối giản ");
            return;
        }
        int a=this.ucln(this.tuSo,this.mauSo);
        System.out.println("Dạng tối giản của phân số cần tìm là :" + this.tuSo/a+"/"+this.mauSo/a);
        return;
    }

    public void xuat(){
        System.out.println(this.tuSo+"/"+this.mauSo);
    }


}
