public class Book {
    private String title;
    protected String author;
    int pages;
    public boolean available;
    public Book(String title, String author, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }
    public String getTitle(){
        return title;
    }
}
class BorrowedBook extends Book {
    public BorrowedBook(String title, String author, int pages, boolean available){
        super(title, author, pages, available);
    }

    public void displayBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + available);
    }
    public static void main(String[] args) {
        BorrowedBook bb= new BorrowedBook("test","test",5,true);
        bb.displayBookDetails();
    }
}
