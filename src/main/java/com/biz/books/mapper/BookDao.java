package com.biz.books.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.biz.books.model.BookVO;

public interface BookDao {

	@Select(" SELECT * FROM tbl_books ")
	public List<BookVO> selectAll();
	
	@Select(" SELECT * FROM tbl_books WHERE b_userid = #{b_userid} ")
	public BookVO selectById(String userid);
	
	@InsertProvider(type=BookSQL.class, method="post_insert_sql")
	public int insert(BookVO bookVO);
	
	@Delete(" DELETE * FROM tbl_books WHERE b_userid = #{b_userid} ")
	public void delete();
}
