import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
        System.out.println("CollectionDemo.main()");
        
        Collection<Integer> arr = new ArrayList<Integer>();
        //Adding Generic type<Integer> on arraylist does't but with collection it will let us know
        arr.add(5);        
        arr.add(4);
        arr.add(6);
        arr.add(6);
        arr.add(9);
        arr.add(5);
        
        for (Integer item : arr) {
            System.out.println(item);
        }


    }
}
