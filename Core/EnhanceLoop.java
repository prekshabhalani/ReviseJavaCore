package Core;
/**
 * Sub Class : Books
 */ 

class Books {
    String name;
    int number;
    String auther;
    int numberOfCopies;

}
/**
 * EnhanceLoop
 */

public class EnhanceLoop {

    public static void main(DemoString[] args) {
        Books b1 = new Books();
        b1.name = "Atomic Habits";
        b1.auther = "James Clear";
        b1.number = 1;
        b1.numberOfCopies = 100;

        Books b2 = new Books();
        b2.name = "The One Things";
        b2.auther = "Gary and Jay";
        b2.number = 2;

        Books b3 = new Books();
        b3.name = "Rich Dad Poor Dad";
        b3.auther = "Robort";
        b3.number = 3;

        //Assign all books obj to books array of Book
        Books books[] = new Books[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;

        for (Books eachBook : books) {
            System.out.println("(" + eachBook.number + ") "+eachBook.name + " By " + eachBook.auther +"-" + eachBook.numberOfCopies+" Copies in total");
        }

    }
}