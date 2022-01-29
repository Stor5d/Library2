public class LibrarianClass extends ReaderClass implements Librarian, Reader {
    public LibrarianClass(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void orderBook(SupplierClass supplier) {
        System.out.println("Библиотекарь " + this.toString() + " заказал книги у поставшика " + supplier.toString());
    }

}
