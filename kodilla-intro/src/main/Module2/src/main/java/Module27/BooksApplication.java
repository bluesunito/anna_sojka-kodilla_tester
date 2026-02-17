package Module27;

public class BooksApplication {
    public static void main(String[] args) {
        Books book = Books.of("Isaac Asimov", "The Galaxy");
        System.out.println("The author of this book is " + book[0] + " and the title is " + book[1]);
    }
}
