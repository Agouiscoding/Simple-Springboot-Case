package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setId(13);
        book.setType("ceshi");
        book.setName("ceshi");
        book.setDescription("ceshi");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("ceshi11");
        book.setName("ceshi");
        book.setDescription("ceshi");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(2,5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","ava");
        System.out.println(bookDao.selectList(qw));
    }

    @Test
    void testGetBy2() {
        String name = null;
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<Book>();
        //检查name非空 不然sql语句会连“null”
        qw.like(name!= null,Book::getName,name);
        System.out.println(bookDao.selectList(qw));
    }
}
