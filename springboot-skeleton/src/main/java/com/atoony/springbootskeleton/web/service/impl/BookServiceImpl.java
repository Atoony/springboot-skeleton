package com.atoony.springbootskeleton.web.service.impl;

import com.atoony.springbootskeleton.web.entity.Book;
import com.atoony.springbootskeleton.web.dao.BookMapper;
import com.atoony.springbootskeleton.web.service.IBookService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Atoony
 * @since 2020-05-12
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Override
    public List<Book> listBooks(Book book) {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name",book.getName());
        return baseMapper.selectList(queryWrapper);
    }
}
