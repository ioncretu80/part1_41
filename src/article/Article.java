package article;

public class Article {

    private String name;
    private String sn;
    private double price;

    public Article(String name, String sn, double price) {
        this.name = name;
        this.sn = sn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", price=" + price +
                '}';
    }
}
