package laba1;
import java.lang.* ;
public class Book {
    private String Title;
    private int Pages;

    public Book(String title, int pages) {
        Title = title;
        Pages = pages;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Pages=" + Pages +
                '}';
    }
}

