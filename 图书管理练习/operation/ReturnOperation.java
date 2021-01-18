package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还的书籍名称");
        String name=scanner.nextLine();
        for(int i=0;i<bookList.getUseSize();i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                book.setStatus(false);
                return;
            }
        }
        System.out.println("没有你要找的这本书");
    }
    }
