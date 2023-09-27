import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        System.out.println("SortList.main()");
        Demo obj = new Demo();
        List<Demo> listObj = new ArrayList<Demo>();

        listObj.add(new Demo(55,"Preksha"));
        listObj.add(new Demo(101,"Kevin"));
        listObj.add(new Demo(100,"Utsav"));

        Collections.sort(listObj);
    }
}

/**
 * Demo
 */
class Demo implements Comparable<Demo> {
    int marks;    
    String student_name;

    public Demo() {
        System.out.println("Load class and Init the Object of Demo...");
    }

    public Demo(int marks, String student_name) {
        this.marks = marks;
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Demo [marks=" + marks + ", student_name=" + student_name + "]";
    }

    @Override
    public int compareTo(Demo that) {
       return this.marks >that.marks ? 1:-1;
    }
    

}
