package Core;
/**
 * InnerAnonymousObject
 */
class InnerAnonymousObject {

    public InnerAnonymousObject(){
        System.out.println("Object Created Hurrrreyyyy!");
    }
    
    public void oneMethod(){
        System.out.println("Function called yupp yupp yupp...");
    }
}
/**
 * AnonymousObject
 */
public class AnonymousObject {

    public static void main(String[] args) {
       //One way 
       InnerAnonymousObject ob = new InnerAnonymousObject();//reusable 
       ob.oneMethod();
      new InnerAnonymousObject();// AnonymousObject
      new InnerAnonymousObject().oneMethod(); //One time use only
      
        
    }
}