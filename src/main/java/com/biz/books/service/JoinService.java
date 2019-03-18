package com.biz.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.books.mapper.JoinDao;
import com.biz.books.model.JoinVO;

@Service
public class JoinService {

	@Autowired
	JoinDao jDao;
	
	public int insert(JoinVO joinVO) {
		int ret = jDao.insert(joinVO);
		return ret;
	}
	
	public JoinVO selectById(String b_userid) {
		return jDao.selectById(b_userid);
	}
	
}
