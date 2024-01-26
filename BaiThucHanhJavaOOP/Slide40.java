import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số ngày: ");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 7) {
            String[] daysOfWeek = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
            System.out.print("Ngày " + day + " thuộc vào: " + daysOfWeek[day - 1]);
        } else {
            System.out.print("Ngày không hợp lệ.");
        }
    }
}