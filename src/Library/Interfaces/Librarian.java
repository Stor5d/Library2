package Library.Interfaces;

import Library.Book;

public interface Librarian {
    void orderBook(Book[] books, Supplier supplier);
}
