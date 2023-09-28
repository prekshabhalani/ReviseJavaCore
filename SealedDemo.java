sealed class A extends  Thread implements   Comparable<A> permits B{

    @Override
    public int compareTo(A o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
non-sealed class B extends A{
    
}
class c extends B{

}
// class D extends D{ --Error

// }
public class SealedDemo {
public static void main(String[] args) {
    System.out.println("SealedDemo.main()");
}    
}
