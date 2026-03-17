public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }
    public void printinfo(){
        System.out.println("Title: "+ title + ", Author: " + author+ ", Pages: " +pageCount+ ", Available: " + available);
    }
    public void borrow(){
        if (available){
            available=false;
            System.out.println(title+" borrowed.");
        }else{
            System.out.println(title+ " is not available");
        }
    }
    public void returnBook(){
        available=true;
        System.out.println(title +" returned");
    }
}
