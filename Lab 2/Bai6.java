import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println(" Nhap vao so nguyen duong bat ky ");
        n = sc.nextInt();
        int giaiThua = 1;
        for (int i = n; i > 0; i--) {
            giaiThua *= i;
        }
        System.out.println(giaiThua);
    }
}