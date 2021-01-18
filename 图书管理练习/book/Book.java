package book;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean status;//默认false


    public Book(String name,String author,int price,String type) {
        this.name=name;
        this.author = author;
        this.price=price;
        this.type=type;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", " +(status==true?"借出":"未借出")+
                '}';
    }
}
