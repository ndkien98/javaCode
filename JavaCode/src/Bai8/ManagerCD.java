package Bai8;

public class ManagerCD {

    private CD cds [] ;
    private int n;

    public ManagerCD(int n){
        this.n =n;
        this.cds = new CD[this.n];
    }

    public boolean addCD(CD cd){
        // xét trường hợp phần tử cuối cùng của mảng nằm ở vị trí n-1

        if(cds[this.n-1] !=null){
            return false;
        }
        for (int i=0;i<cds.length;i++){
            if(cds[i].getId()==cd.getId()){
                return false;
            }
        }

        for (int i=0;i<cds.length;i++){
            if(cds[i] == null){
                cds[i]=cd;
                break;
            }
        }
        return true;
    }

    public int tinhSoLuongCD(){
        int cout = 0;
        for (int i=0;i<cds.length;i++){
            if(cds[i] instanceof CD){
                cout++;
            }
        }
        return cout;
    }

    public int sumPriceCD(){
        int cout=0;
        for (int i=0;i<cds.length;i++){
            if (cds[i]!=null){
                cout+=cds[i].getMoney();
            }
        }
        return cout;
    }

    public void sorttoTopfromDow(){
        for (int i=0;i<cds.length;i++){
            for (int j=i+1;i<cds.length;j++){
                if (cds[i].getMoney()>cds[j].getMoney()){
                    CD cd = cds[i];
                    cds[i] = cds[j];
                    cds[j]=cds[i];
                }
            }
        }
    }

    public void sortIncrement(){
        for (int i = 0; i <cds.length ; i++) {
            for (int j = i+1; j <cds.length; j++) {
                if(cds[i].getTitle().compareTo(cds[j].getTitle())>0){
                    CD cd = cds[i];
                    cds[i]=cds[j];
                    cds[j]=cd;
                }
            }

        }
    }

    public void outPut(){
        for (int i = 0; i <cds.length ; i++) {
            if(cds[i]!=null){
                cds[i].Xuat();
            }
        }
    }

}
