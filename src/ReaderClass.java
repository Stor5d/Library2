public class ReaderClass extends User implements Reader {
    public ReaderClass(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Читатель " + this.toString() + " взял в библиотеке книгу " + book.toString());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Читатель " + this.toString() + " вернул в библиотеку книгу " + book.toString());
    }

}
