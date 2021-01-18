package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要查找的图书名称");
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getUseSize();i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要查找的书籍");
    }
}
