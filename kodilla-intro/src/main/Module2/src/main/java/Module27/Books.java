package Module27;

public class Books {
    private String author;
    private String title;

    public Books(String author, String title){
        this.author = author;
        this.title = title;
    }

    public static String[] of(String a, String b){
        Books book = new Books(a,b);
        return book;
    }
}
