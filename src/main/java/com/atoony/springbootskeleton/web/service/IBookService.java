package com.atoony.springbootskeleton.web.service;

import com.atoony.springbootskeleton.web.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Atoony
 * @since 2020-05-12
 */
public interface IBookService extends IService<Book> {

    List<Book> listBooks(Book book);
}
