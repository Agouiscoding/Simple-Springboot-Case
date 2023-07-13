package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll() {
        return new R(true, iBookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) {
<<<<<<< HEAD
     boolean flag =   iBookService.save(book);
        return new R(flag,flag? "添加成功" : "添加失败");
=======
        return new R(iBookService.save(book));
>>>>>>> 2cb6bb0ececf12786b86c957f956ddc53e20b67c
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(iBookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(iBookService.delete(id));
    }

    @GetMapping("{id}")
    public R GetById(@PathVariable Integer id) {
        return new R(true, iBookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
<<<<<<< HEAD
        IPage<Book> page = iBookService.getPage(currentPage,pageSize);
        if (currentPage > page.getPages()){
            page = iBookService.getPage((int) page.getPages(),pageSize);
        }
        return new R(true, page);
=======
        return new R(true, iBookService.getPage(currentPage, pageSize));
>>>>>>> 2cb6bb0ececf12786b86c957f956ddc53e20b67c
    }
}
