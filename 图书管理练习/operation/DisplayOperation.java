package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("打印书籍");
        for(int i=0;i<bookList.getUseSize();i++){
            Book book=bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
