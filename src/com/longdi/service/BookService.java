package com.longdi.service;

import com.longdi.pojo.Book;
import com.longdi.pojo.Page;

import java.util.List;

/**
 * @author: 龍弟
 * @description
 * @date: 2021/9/18 12:43
 */
public interface BookService {

    public void addBook(Book book);
    public void deleteBookById(Integer id);
    public void updateBook(Book book);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();
    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
    Page<Book> page(int pageNo, int pageSize);
}
