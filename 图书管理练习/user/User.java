package user;

import book.BookList;
import com.sun.corba.se.spi.orb.Operation;
import operation.IOperation;

abstract public class User {
    public String name;
    public IOperation[]operations;
    public User(String name) {
        this.name = name;
    }
  abstract   public int menu();
    public void doOperation(int choice, BookList bookList){
        this.operations[choice].work(bookList);
    }
}
