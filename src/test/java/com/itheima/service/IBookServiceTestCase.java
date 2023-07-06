package com.itheima.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTestCase {
    @Autowired
    private IBookService ibookService;

    @Test
    void testGetById(){
        System.out.println(ibookService.getById(4));
    }
}
