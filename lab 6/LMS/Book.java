package ibrarymanagementsystem;

public class Book {
    private String title;
    private String author;

   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

 
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
