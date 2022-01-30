import Library.Book;
import Library.Interfaces.*;
import Library.User;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Возрождение", "Степан Кулик");
        Book book2 = new Book("Война и мир", "Лев Толстой");
        Book[] books = new Book[]{book1, book2};

        User user1 = new User("Николай", "Басков");
        Reader reader = user1;
        Supplier supplier = user1;
        User user2 = new User("Жанна", "Агузарова");
        Administrator administrator = user2;
        Librarian librarian = user2;

        reader.takeBook(book1, administrator);
        administrator.findBook(book1);
        administrator.giveBook(book1, reader);
        administrator.notifyOfDelay(book1, reader);
        reader.returnBook(book1, administrator);
        librarian.orderBook(books, supplier);
        supplier.deliveryBook(books, librarian);

    }
}
