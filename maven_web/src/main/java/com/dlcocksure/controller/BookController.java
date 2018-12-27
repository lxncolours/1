package com.dlcocksure.controller;

import com.dlcocksure.domain.Book;
import com.dlcocksure.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Book> list = bookService.findAll();
        System.out.println(list);
        ModelAndView mav = new ModelAndView("success");
        mav.addObject("list",list);
        return mav;
    }
}
