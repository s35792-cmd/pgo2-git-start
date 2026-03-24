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

        Reader r1 = new Reader("John", "Hudson", 243, 0);
        Reader r2 = new Reader("Marry", "Connor", 638, 3);
        r1.printData();
        r1.increaseBorrowedCount();
        r1.printData();

        r2.printData();
        r2.decreaseBorrowedCount();
        r2.printData();

        Library library = new Library(5);
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.printAvailableBooks();
        Book found = library.findBookByTitle("The 22 laws of marketing");
        if(found!=null){
            found.printinfo();
        }
        System.out.println(library.countAvailableBooks());
        b2.printinfo();
        r1.printData();
        if(b2.isAvailable()){
            b2.borrow();
            r1.increaseBorrowedCount();
        }
        b2.printinfo();
        r1.printData();
        b2.returnBook();
        r1.decreaseBorrowedCount();
        b2.printinfo();
        r1.printData();
    }
}
