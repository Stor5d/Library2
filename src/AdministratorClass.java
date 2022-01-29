public class AdministratorClass extends ReaderClass implements Administrator, Reader {
    public AdministratorClass(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void findBook(Book book) {
        System.out.println("Администратор " + this.toString() + " находит книгу " + book.toString());
    }

    @Override
    public void giveBook(Book book) {
        System.out.println("Администратор " + this.toString() + " выдает книгу " + book.toString());
    }

    @Override
    public void notifyOfDelay(Book book, ReaderClass reader) {
        System.out.println("Администратор " + this.toString() + " уведомляет " + reader.toString() + " о просрочке книги " + book.toString());
    }

}
