package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

public interface IBookService extends IService<Book> {
    //通用方法 后面可以补充
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);
}
