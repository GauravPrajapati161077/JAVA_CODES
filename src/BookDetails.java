import java.util.Scanner;

public class BookDetails {
    int bookId,edition;
    float bookPrice,rating;
    Boolean availability;
    String title,Author;
    String[] genre= new String[2];
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter bookid");
        bookId=sc.nextInt();
        System.out.println("Enter Edition");
        edition=sc.nextInt();
        System.out.println("Enter Price");
        bookPrice=sc.nextFloat();
        System.out.println("enter availability");
        availability=sc.nextBoolean();
        sc.nextLine();
        System.out.println("enter book title");
        title= sc.nextLine();
        System.out.println("enter author");
        Author=sc.nextLine();
        System.out.println("enter rating");
        rating=sc.nextFloat();
        System.out.println("enter gener any 2");
        for(int i=0;i<2;i++){
          genre[i]=sc.nextLine();
        }

    }
    public void printDetails(){
        System.out.println("Book Id  "+bookId);
        System.out.println("Book title  "+title);
        System.out.println("Author  "+Author);
        System.out.println("edition  "+edition);
        System.out.println("Rating  "+rating);
        System.out.println("Book Price  "+bookPrice);
        System.out.println("Availabilty  "+availability);
        System.out.println("Genre ");
        for(int i=0;i<2;i++) {
            System.out.println(genre[i] + "  ");
          }
        }
    public static void main(String[] args){
        BookDetails b= new BookDetails();
        b.input();
        b.printDetails();
    }
    }


