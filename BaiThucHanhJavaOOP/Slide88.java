import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String , String> hashMapCity = new HashMap<>();
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ngai");
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong hashMapCity");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.err.println(setCity);
        System.out.println("QNg" + hashMapCity.get("Qng"));
        System.out.println("NT" + hashMapCity.get("NT"));
        if(hashMapCity.containsValue("Tahnh pho Ho Chi Minh")) {
            System.out.println("Co thanh pho Ho Chi Minh trpng hashMapCity");
        }
    }
}
