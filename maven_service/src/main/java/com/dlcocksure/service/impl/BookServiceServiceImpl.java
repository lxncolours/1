package com.dlcocksure.service.impl;

import com.dlcocksure.dao.BookDao;
import com.dlcocksure.domain.Book;
import com.dlcocksure.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
