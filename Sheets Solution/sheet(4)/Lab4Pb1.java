import java.time.LocalDate;
import java.util.Scanner;

class Book {
    static int bookCount = 0;
    private int ID;
    private String title;
    private double price;
    private LocalDate releaseDate;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Book(String title, double price, LocalDate releaseDate) {
        this.ID = ++bookCount;
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public void printBook() {
        System.out.println("ID = " + ID);
        System.out.println("Title = " + this.title);
        System.out.println("Price = " + this.price);
        System.out.println("Release = " + this.releaseDate);
    }
}

class TextBook extends Book {

    private int numPages;

    public int getNumPages() {
        return numPages;
    }

    public TextBook(String title, double price, LocalDate releaseDate, int numPages) {
        super(title, price, releaseDate);
        this.numPages = numPages;
    }

    public void printTextBook() {
        printBook();
        System.out.println("Num of pages  : " + this.numPages);
    }
}

class AudioBook extends Book {

    private double lenMins;

    public AudioBook(String title, double price, LocalDate releaseDate, double lenMins) {
        super(title, price, releaseDate);
        this.lenMins = lenMins;
    }

    public double getLenMins() {
        return lenMins;
    }

    public void printAudioBook() {
        printBook();
        System.out.println("length in mins  : " + this.lenMins);
    }
}

public class Lab4Pb1 {
    public static Book readBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title");
        String title = sc.nextLine();

        System.out.println("Enter Book price");
        double price = sc.nextDouble();

        System.out.println("Enter release date day then month then year");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Choose Book Type 1.book 2.TextBook 3.AudioBook");
        int choice = sc.nextInt();

        if (choice == 1) {
            Book b = new Book(title, price, LocalDate.of(y, m, d));
            return b;
        } else if (choice == 2) {
            System.out.println("Enter TextBook number of pages");
            int pages = sc.nextInt();
            TextBook tb = new TextBook(title, price, LocalDate.of(y, m, d), pages);
            // This works because a function returning a super class can return any of its
            // subclasses.
            return tb;
        } else if (choice == 3) {
            System.out.println("Enter AudioBook length in minutes");
            double lenMins = sc.nextDouble();
            AudioBook ab = new AudioBook(title, price, LocalDate.of(y, m, d), lenMins);
            return ab;
        } else {
            System.out.println("Invalid Choice - creating a Book type");
            Book b = new Book(title, price, LocalDate.of(y, m, d));
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books you will enter ?");
        int N = sc.nextInt();

        Book[] books = new Book[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter Book " + (i + 1) + " properties");
            books[i] = readBook();
        }

        for (int i = 0; i < books.length; i++) {
            // Shouldn't start with if(books[i] instanceof Book)
            // because it will always be true.
            if (books[i] instanceof TextBook) {
                ((TextBook) books[i]).printTextBook();
            } else if (books[i] instanceof AudioBook) {
                ((AudioBook) books[i]).printAudioBook();
            } else {
                books[i].printBook();
            }
        }
    }
}
