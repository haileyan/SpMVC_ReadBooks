package com.biz.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.books.mapper.BookDao;
import com.biz.books.model.BookVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookService {

	@Autowired
	BookDao bDao;
	
	public int insert(BookVO bookVO) {
		int ret = bDao.insert(bookVO);
		return ret;
	}
	
	public List<BookVO> selectAll(){
		return bDao.selectAll();
	}
	
	public BookVO selectById(String userid) {
		return bDao.selectById(userid);
	}

}
