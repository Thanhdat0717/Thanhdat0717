import java.util.HashSet;
import java.util.Scanner;
public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        System.out.println("Cac phan tu trong hashSetring :");
        System.err.println(hashSetString);
        System.out.println("Nhap phan tu can xoa :");
        name = sc.nextLine();

        if (hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xoa thanh cong !");
            System.err.println("Cac phan tu con lai trong hashSetring la :");
            System.out.println(hashSetString);
        }
        else { 
        System.err.println("xoa khong thanh cong !");
        }
    }
}
