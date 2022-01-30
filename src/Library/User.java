package Library;

import Library.Interfaces.*;

public class User implements Reader, Supplier, Librarian, Administrator {
    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return " [ " + surname + " " + name + " ] ";
    }

    @Override
    public void takeBook(Book book, Administrator administrator) {
        System.out.println("Читатель " + this + " взял в библиотеке книгу " + book.toString() + " у администратора " + administrator.toString());
    }

    @Override
    public void returnBook(Book book, Administrator administrator) {
        System.out.println("Читатель " + this + " вернул в библиотеку книгу " + book.toString() + " администратору " + administrator.toString());
    }


    @Override
    public void findBook(Book book) {
        System.out.println("Администратор " + this + " находит книгу " + book.toString());
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.println("Администратор " + this + " выдает книгу " + book.toString() + " читателю " + reader.toString());
    }

    @Override
    public void notifyOfDelay(Book book, Reader reader) {
        System.out.println("Администратор " + this + " уведомляет " + reader.toString() + " о просрочке книги " + book.toString());
    }

    @Override
    public void orderBook(Book[] books, Supplier supplier) {
        System.out.println("Библиотекарь " + this + " заказал книги у поставшика " + supplier.toString());
    }

    @Override
    public void deliveryBook(Book[] books, Librarian librarian) {
        System.out.println("Поставщик " + this + " доставил книги библиотекарю " + librarian.toString());
    }

}
