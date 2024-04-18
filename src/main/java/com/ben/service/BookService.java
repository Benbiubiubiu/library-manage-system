package com.ben.service;

import com.ben.pojo.Book;
import com.ben.pojo.Borrow;

import java.util.List;
import java.util.Map;

public interface BookService {

    List<Borrow>getBorrowList();
    Map<Book,Boolean>getBookList();
    void addBorrow(int sid, int bid);
    List<Book> getActiveBookList();
    void returnBook(int id);
    void addBook(String title,String desc,double price);
    void deleteBook(int id);
}
