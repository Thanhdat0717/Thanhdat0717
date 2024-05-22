import java.util.Scanner;

public class Person{
    public String hovaten;
    public int tuoi;
    public float chieucao;

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten :");
        hovaten = sc.nextLine();
        System.out.println("Nhap tuoi :");
        tuoi = sc.nextInt();
        System.err.println("Nhap chieu cao :");
        chieucao = sc.nextFloat();
    }
    public void HienThiThongTin(){
        System.err.println("hovaten" + hovaten);
        System.out.println("tuoi" + tuoi);
        System.out.println("chieucao" + chieucao);
    }
}