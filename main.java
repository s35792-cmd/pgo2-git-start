public class main {
    public static void main(String[] args){
        Book b1 = new Book("Harry Potter", "J.K.Rowling", 500,true);
        Book b2 = new Book("No rules rules:Netflix", "Erin Maeyer", 320, true);
        Book b3 = new Book("The 22 laws of marketing", "Al Ries & Jack Trout", 144, false);
        b1.printinfo();
        b2.printinfo();
        b3.printinfo();
        b1.borrow();
        b2.borrow();
        b1.returnBook();
    }
}
