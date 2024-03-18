import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Pbl {

    public String title;
    public String author;
    public int publicationYear;

    public Java_Pbl(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public static void main(String[] args) {

        List<Java_Pbl> booksAvailable = new ArrayList<>();

        booksAvailable.add(new Java_Pbl("STEVE JOBS", "Walter Isaacson", 2015));
        booksAvailable.add(new Java_Pbl("Elon Musk", "Walter Isaacson", 2023));
        booksAvailable.add(new Java_Pbl("Core Java: An Integrated Approach (Black Book)", "Jane Austen", 1813));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title or author of the book you want to search: ");
        String search = input.nextLine();

        for (Java_Pbl book : booksAvailable) {

            if (book.getTitle().equalsIgnoreCase(search)) {

                System.out.println("Book found:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publication Year: " + book.getPublicationYear());
                return; 
            }
        }

        System.out.println("Book not found. Sorry!");
    }
}
