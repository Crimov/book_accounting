package com.vlad;

public class Book {
    private String bookName;
    private String Author;
    
    public Book(String bookName, String author) {
        this.bookName = bookName;
        Author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "\"" + bookName + "\" - " + Author + " - Доступна";
    }
}
