package Utils;

public class Book {
    private String title;
    private String author;
    private String numberOfPages;
    private String publisher;
    private String language;
    private String bookType;

    public Book(String title, String author, String numberOfPages, String publisher, String language, String bookType) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.language = language;
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}