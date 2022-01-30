package Library.Interfaces;

import Library.Book;

public interface Supplier {
    void deliveryBook(Book[] books, Librarian librarian);
}
