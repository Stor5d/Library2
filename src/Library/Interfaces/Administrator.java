package Library.Interfaces;

import Library.Book;

public interface Administrator {
    void findBook(Book book);

    void giveBook(Book book, Reader reader);

    void notifyOfDelay(Book book, Reader reader);
}
