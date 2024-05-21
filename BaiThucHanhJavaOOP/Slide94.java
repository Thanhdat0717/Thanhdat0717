import java.util.Map;
import java.util.LinkedHashMap;
public class Slide94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(1,"Mo");
        hm.put(2,"Dia");
        hm.put(3,"Chat");
        for(Map.Entry<Integer,String> m:hm.entrySet())
          System.out.println(m.getKey() + " " + m.getValue());
        System.out.println("truoc khi xoa : " + hm);
        hm.remove(1);
        System.out.println("sau khi xoa " + hm);
    }
}