class ThrowExcep {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
}
/**
 * Throw
 */
public class Throw {
    public static void main(String[] abc){
        System.out.println("Hey you are back");
        try {
            ThrowExcep.fun();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}