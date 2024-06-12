package ss4.bai_tap.fan;

public class QuanLyFan{
    private Fan[]quanLyFan;
    private int limit;
    private int size;
    public QuanLyFan(int limit) {
        this.quanLyFan = new Fan[limit];
        this.limit = limit;
        this.size = 0;
    }
    public void themFan(Fan fan){
        if (size < limit){
            quanLyFan[size] = fan;
            size++;
            System.out.println("Danh sach fan da duoc them vao");
        }
        else {
            System.out.println("Danh sach fan da day");
        }
    }
    public void hienThiQuanLyFan(){
        if (size == 0 ){
            System.out.println("Danh sach fan trong");
        }
        else {
            System.out.println("Danh sach fan: ");
            for(int i = 0; i < size; i++){
                System.out.println(quanLyFan[i].toString());
            }
        }
    }
}