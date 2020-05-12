package com.atoony.springbootskeleton.web.controller;


import com.atoony.springbootskeleton.web.entity.Book;
import com.atoony.springbootskeleton.web.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Atoony
 * @since 2020-05-12
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @PostMapping("")
    public Object addBook(@RequestBody @Validated Book book){
        return bookService.save(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id")Long id){
        return bookService.getById(id);
    }

    @GetMapping("")
    public List<Book> listBook(@RequestBody @Validated Book book){
        return bookService.listBooks(book);
    }

    @PutMapping("")
    public Object editBook(@RequestBody @Validated Book book){
        return bookService.updateById(book);
    }

    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable("id")Long id){
        return bookService.removeById(id);
    }


}
