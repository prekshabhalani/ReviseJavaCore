import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 * Values are sorted
 * Can be of one type or multiple as well
 * Have uniq values only
 */
public class SetTreeSet {

    public static void main(String[] args) {
        System.out.println("Good going");
        Set<Integer> s = new TreeSet<Integer>();
        
        s.add(5);        
        s.add(4);
        s.add(6);
        s.add(6);
        s.add(9);
        s.add(5);

        for (Integer integer : s) {
            System.out.println(integer);
        }

    }
}