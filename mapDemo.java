import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class mapDemo {

  public static void main(String[] args) {
    Map<String, Integer> data = new HashMap<>();

    data.put("Utsav", 1);
    data.put("Kevin", 100);
    data.put("Preksha", -1);
    data.put("Manshi", 50);
    data.put("Akshay", 50);
    int num = data.get("Utsav");
    Set s = data.keySet();
    System.out.println(s);
    data.clear();
    
    System.out.println(data.isEmpty());

    for (Object object : s) {
      System.out.println(data.get(object));
    }
  }
}
