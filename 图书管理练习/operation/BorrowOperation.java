package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要借阅的书籍名称");
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getUseSize();i++){
           Book  book=bookList.getBooks(i);
           if(book.getName().equals(name)){
               book.setStatus(true);
               return;
           }
        }
        System.out.println("没有你要找的这本书");
    }
}
