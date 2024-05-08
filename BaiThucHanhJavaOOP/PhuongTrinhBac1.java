import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a, b;
        System.out.print("He so a: ");
        a = sc.nextDouble();
        System.out.print("He so b: ");
        b = sc.nextDouble();
        double x = -b/a;
        if (a==0) 
            System.out.println("Khong phai phuong trinh bac nhat");    
        else System.out.println("Phuong trinh co nghiem duy nhat la: " + x);
    }
}