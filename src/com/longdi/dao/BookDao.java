package com.longdi.dao;

import com.longdi.pojo.Book;

import java.util.List;

/**
 * @author: 龍弟
 * @description
 * @date: 2021/9/18 12:19
 */
public interface BookDao {
    public int addBook(Book book);
    public int deleteBookById(Integer id);
    public int updateBook(Book book);

    public Book queryBookById(Integer id);
    public List<Book> queryBooks();

    Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int begin, int pageSize);

    List<Book> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);

    Integer queryForPageTotalCountByPrice(int min, int max);
}
