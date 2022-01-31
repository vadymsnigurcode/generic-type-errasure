import java.util.ArrayList;
import java.util.List;

public class Program1 {

//    int count(List<String> data) {
//       return data.size();
//    }
//
//    int count(List<String> data1) {
//        return data.size();
//    }
//
//    int count(List<Integer> data1) {
//        return data1.size();
//    }
//
//    public static <T> T getFirst(List<? super T> list) {
//        return list.get(0); // compile-time error
//    }

    static List<String> t() {
        List l = new ArrayList<Number>();
        l.add(1);
        List<String> ls = l; // (1)
        ls.add("");
        return ls;
    }

    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<Integer>();
//        ints.add(1);
//        ints.add(2);
//        //List<? extends Number> nums = ints;
//        List<? extends Number> nums = ints;
//        nums.add(3.14); // compile-time error

        ArrayList<String> strings = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add("stringData");
        strings = arrayList; // Unchecked assignment
        arrayList.add(1); //unchecked call

        arrayList.forEach(System.out::println);
    }
}
