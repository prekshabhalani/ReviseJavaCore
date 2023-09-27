import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingList {
  static {
    System.out.println("SortingMap.enclosing_method()");
  }

  public static <T> void main(String[] args) {
    List<String> obj = new ArrayList<String>();

    obj.add("Preksha");
    obj.add("Utsav");
    obj.add("Kevin");
    obj.add("Akshay");
    obj.add("Manshi");

    // Comparator<String> cm = new Comparator<String>() {
    //   @Override
    //   public int compare(String o1, String o2) {
    //     return o1.length() > o2.length() ? 1 : -1;
    //   }
    // };
    Comparator<String> cm = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;

    Collections.sort(obj, cm);
    System.out.println(obj);
  }
}
