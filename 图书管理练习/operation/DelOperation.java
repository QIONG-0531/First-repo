package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除的图书名称");
        String name=scanner.nextLine();
        int i=0;
        for(;i<bookList.getUseSize();i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i>=bookList.getUseSize()){
            System.out.println("没有你要删的这本书");
        }
        for(int j=i;j<bookList.getUseSize()-1;j++){
            Book book=bookList.getBooks(j+1);
            bookList.setBooks(j,book);
        }
        int countSize=bookList.getUseSize();
        bookList.setUseSize(countSize-1);

    }
}
