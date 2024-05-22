import java.util.Scanner;

public class LTD228Student extends LTD228Person{
    public long MaSv;

    @Override
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MaSv");
        MaSv = sc.nextLong();
    }
    public void XuatThongTin(){
        System.out.println("MaSv" + MaSv);
    }
}
