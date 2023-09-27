import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {
        System.out.println("yup u are doing great");
        List<Integer> l = new ArrayList<Integer>();
        l.add(5);        
        l.add(4);
        l.add(6);
        l.add(6);
        l.add(9);
        l.add(5);
        // for (Integer integer : l) {
        //     System.out.println(integer);
        // }
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

}
