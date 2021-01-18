package book;

public class BookList {
    private  Book[]books;
    private int useSize;
    public BookList(){
        books=new Book[10];
        books[0]=new Book("三国演义","罗贯中",100,"小说");
        books[1]=new Book("西游记","吴承恩",90,"小说");
        books[2]=new Book("水浒传","施耐庵",80,"小说");
        this.useSize=3;
    }

    public Book getBooks(int pos) {

        return books[pos];
    }
//尾插法
    public void setBooks(int pos,Book book) {

        this.books [pos]= book;
    }

    public int getUseSize() {

        return useSize;
    }

    public void setUseSize(int useSize) {

        this.useSize = useSize;
    }
}
