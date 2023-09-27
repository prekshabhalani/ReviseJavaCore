/**
 * A
 */ 
interface A {
    public void sum(int a, int b);//Auto abstract
    int a = 5;//Auto Final And Static
}

/**
 * B
 */ 
interface B {
    public void sum(int a, int b);//Auto abstract
    int a = 5;//Auto Final And Static
}
/**
 * c
 */ 
interface C extends B{
    public void sum(int a, int b);//Auto abstract
    int a = 5;//Auto Final And Static
}

/**
 * D
 */
class D implements C {

    @Override
    public void sum(int a, int b) {

    }

    
}

abstract class E implements C {

    
}
/**
 * F
 */
class F extends E {

    @Override
    public void sum(int a, int b) {
    }

    
}
public class Interface {
    public static void main(String[] args) {
        System.out.println("Welcome back girl...");
        C obj = new C() {
            public void sum(int a, int num){
                System.out.println(a+num);
            };
        };
        obj.sum(5, 4);
    }
}
