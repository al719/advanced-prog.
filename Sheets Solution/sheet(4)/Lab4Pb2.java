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

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID = " + this.ID + "\n" + "Title = " + this.title + "\n" + "Price = " + this.price + "\n" + "Release = "
                + this.releaseDate + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        // Instantly exit if comparing the same object.
        if (this == obj)
            return true;

        // If using another object type, return false.
        if (!(obj instanceof Book))
            return false;

        // Typecast here to avoid doing it with each use of the object.
        Book b = (Book) obj;
        if (this.title.equalsIgnoreCase(b.title) && this.releaseDate.equals(b.releaseDate))
            return true;

        return false;
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

    @Override
    public String toString() {
        return super.toString() + "Number of pages = " + this.numPages + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TextBook))
            return false;

        // Use the base class equals() to check if it the has same title
        // and release date
        if (super.equals(obj) == false)
            return false;

        TextBook tb = (TextBook) obj;
        if (this.numPages == tb.numPages)
            return true;

        return false;
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

    @Override
    public String toString() {
        return super.toString() + "Length in minutes = " + this.lenMins + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof AudioBook))
            return false;

        if (super.equals(obj) == false)
            return false;

        AudioBook ab = (AudioBook) obj;
        if (this.lenMins == ab.lenMins)
            return true;

        return false;
    }
}

public class Lab4Pb2 {
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
            System.out.println("");
            books[i].print();
        }
    }
}
