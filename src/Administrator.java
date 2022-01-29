public interface Administrator {
    void findBook(Book book);

    void giveBook(Book book);

    void notifyOfDelay(Book book, ReaderClass reader);
}
