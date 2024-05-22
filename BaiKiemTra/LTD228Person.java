import java.util.ArrayList;
import java.util.Scanner;

public class LTD228Person{
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
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu co trong arrayList");
        int number = sc.nextInt();

        for(int i=0; i<n;i++){
            LTD228Person person = new LTD228Person();
            System.out.println("Nhap phan tu thu (i+1)");
            person.NhapThongTin();
            arrayList.add(person);
        }

        for(int i=0; i<n;i++){
            LTD228Person person = new LTD228Person();
            arrayList.get(i).HienThiThongTin();
        }
        System.out.println("Vi tri can sua");
        int i = sc.nextInt();
        if(){
            
        }
    }
}