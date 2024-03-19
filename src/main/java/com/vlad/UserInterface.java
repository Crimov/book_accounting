package com.vlad;

public class UserInterface {
    private static Library library = new Library();

    public static void run(){
        showGreeting();
        while(true){
            int action = Integer.parseInt(System.console().readLine("Выберите действие (Введите номер) : "));
            switch(action){
                case 1:
                    String name = System.console().readLine("Введите название книги: ");
                    String author = System.console().readLine("Введите автора книги: ");
                    library.addBook(new Book(name,author));
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    library.findBookByName(System.console().readLine("Введите название книги для поиска: "));
                    break;
                case 4:
                    int bookNumber = Integer.parseInt(System.console().readLine("Введите номер книги для удаления: "));
                    library.deleteBookByNumber(bookNumber);
                    break;
                case 5:
                    System.out.println("До свидния!");
                    return;
                default:
                    System.out.println("Вы ввели неверную цифру, попробуйте снова.");
            }
        }
    }

    private static void showGreeting(){
        System.out.println("Добро пожаловать в приложение \"Учет книг в библиотеке\"!");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Просмотреть список книг");
        System.out.println("3. Найти книгу по названию");
        System.out.println("4. Удалить книгу");
        System.out.println("5. Выход");
    }
}
