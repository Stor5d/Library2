public class SupplierClass extends ReaderClass implements Supplier, Reader {
    public SupplierClass(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void deliveryBook() {
        System.out.println("Поставщик " + this.toString() + " доставил книги в библиотеку ");
    }

}
