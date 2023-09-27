import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * IteratorDemo
 */
public class IteratorDemo{

    public static void main(String[] args) {
        System.out.println("Yuhhh... Focus");
        Collection<Integer> s = new TreeSet<>();
         
        s.add(45);        
        s.add(84);
        s.add(86);
        s.add(96);
        s.add(59);
        s.add(35);
        s.add(-35);

        Iterator<Integer> values = s.iterator(); 
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}