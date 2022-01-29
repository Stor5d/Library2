public class Main {

    public static void main(String[] args) {
        ReaderClass reader = new ReaderClass("Иван", "Иванов");
        LibrarianClass librarian = new LibrarianClass("Петр", "Донской");
        SupplierClass supplier = new SupplierClass("Филипп", "Киркоров");
        AdministratorClass administrator1 = new AdministratorClass("Николай", "Басков");
        Book book = new Book("Возрождение", "Степан Кулик");

        reader.takeBook(book);
        reader.returnBook(book);
        librarian.orderBook(supplier);
        supplier.deliveryBook();
        supplier.takeBook(book);
        administrator1.findBook(book);
        administrator1.giveBook(book);
        administrator1.notifyOfDelay(book, librarian);
        administrator1.takeBook(book);
    }
}
