package com.vlad;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List <Book> books = new ArrayList<>(); 

    public void addBook(Book book){
        books.add(book);
    }

    public void showBooks(){
        System.out.println("Список книг: ");
        if(books.isEmpty()){
            System.out.println("(пусто)");
            return;
        }
        for(int i = 0; i < books.size(); i++){
            System.out.println(i+1 + ". " + books.get(i));
        }
    }

    public void deleteBookByNumber(int number){
        if(number > books.size()){
            System.out.println("Книги с данным номером нет в библиотеке");
            return;
        }
        System.out.println("Книга " + books.get(number-1).getBookName() + " удалена");
        books.remove(number-1);
    }

    public void findBookByName(String name){
        books.stream()
            .filter(b-> b.getBookName().equals(name))
            .findFirst()
            .ifPresentOrElse(book-> System.out.println(books.indexOf(book)+1 + ". \"" + book.getBookName() + "\" - " + book.getAuthor() + " - Доступна")
            ,()->System.out.println("Книга не найдена"));
    }
}

