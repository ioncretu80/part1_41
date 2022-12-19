package books;

public class Book {
    private String name;

    private int jahr;

    public Book(String name, int jahr) {
        this.name = name;
        this.jahr = jahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", jahr=" + jahr +
                '}';
    }
}
