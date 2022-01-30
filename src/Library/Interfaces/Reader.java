package Library.Interfaces;

import Library.Book;

public interface Reader {
    void takeBook(Book book, Administrator administrator);

    void returnBook(Book book, Administrator administrator);
}
