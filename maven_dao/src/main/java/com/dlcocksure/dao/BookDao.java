package com.dlcocksure.dao;


import com.dlcocksure.domain.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Select("select * from book")
    List<Book> findAll();
}
