public abstract class User {
    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return " [ " + surname + " " + name + " ] ";
    }
}
