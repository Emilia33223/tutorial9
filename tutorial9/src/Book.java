public class Book implements MediaItem {
    private String title;
    private String author;
    private int year;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        isAvailable = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getFormattedString() {
        return "Title: " + title + " Author: " + author + " Year: " + year;
    }

    static boolean isAvailable(boolean isAvailable) {
        return isAvailable;
    }
}
