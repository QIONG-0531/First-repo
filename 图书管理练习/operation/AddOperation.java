package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书名称");
        String name=scanner.nextLine();
        System.out.println("请输入作者名字");
        String author=scanner.nextLine();
        System.out.println("请输入图书价格");
        int price=scanner.nextInt();
        System.out.println("请输入图书类型");
        String type=scanner.nextLine();
        Book book=new Book(name,author,price,type);
        int countSize=bookList.getUseSize();
        bookList.setBooks(countSize,book);
        bookList.setUseSize(countSize+1);
    }
}
