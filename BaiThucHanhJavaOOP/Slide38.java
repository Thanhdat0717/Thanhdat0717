import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("Su dung phuong thuc addAll()");
        System.out.println("----------------------------");
        
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        System.out.println("Su dung phuong thuc retainAll()");
        System.out.println("-------------------------------");
        
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA :");
        showList(listA);

        System.out.println("Su dung phuong thuc removeAll()");
        list.removeAll(listB);
        System.out.print("list :");
        showList(list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list){
            System.out.print("\t" + obj + ",");
        }
        System.out.println();   
    }
}
