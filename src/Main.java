import Library.Book;
import Library.User;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Возрождение", "Степан Кулик");
        Book book2 = new Book("Война и мир", "Лев Толстой");
        Book[] books = new Book[]{book1, book2};

        User user1 = new User("Николай", "Басков");
        User user2 = new User("Жанна", "Агузарова");

        user1.takeBook(book1, user2);
        user2.findBook(book1);
        user2.giveBook(book1, user1);
        user2.notifyOfDelay(book1, user1);
        user1.returnBook(book1, user2);
        user2.orderBook(books, user1);
        user1.deliveryBook(books, user2);

    }
}
