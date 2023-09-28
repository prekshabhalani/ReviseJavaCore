import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * StreamDemo
 */
public class StreamDemo {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 5, 1, 9, 8, 1, 7);
    List<Integer> sortList = new ArrayList<Integer>();

    //Find Odd no.'s double's sorting and total
    /***************** */
    Stream<Integer> str = list.stream()
    .filter(l->l%2 != 0)
    .map(l->l*2)
    .sorted();
    str.forEach(l->System.out.println(l));
    
    // int str = list.stream()
    // .filter(l->l%2 != 0)
    // .map(l->l*2)
    // .sorted()
    // .reduce(1,(c,e)->c*e);


    /***************** */
    for (int l : list) {
      if (l % 2 != 0) sortList.add(l * 2);
    }
    Collections.sort(sortList);
    System.out.println(sortList);
    sortList.clear();

    /***************** */
    list.forEach(l -> {
      if (l % 2 != 0) sortList.add(l * 2);
    });
    Collections.sort(sortList);
    System.out.println(sortList);
    sortList.clear();

    /***************** */
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 != 0) sortList.add(list.get(i) * 2);
    }
    Collections.sort(sortList);
    System.out.println(sortList);
  }
}
