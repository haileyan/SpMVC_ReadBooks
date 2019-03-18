package com.biz.books.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

import com.biz.books.model.BookVO;
import com.biz.books.model.JoinVO;

public interface JoinDao {

	@Select( " SELECT * FROM tbl_member ")
	public List<JoinVO> selectAll();
	
	@Select( " SELECT * FROM tbl_member WHERE b_userid = #{b_userid} ")
	public JoinVO selectById(String b_userid);
	
	@InsertProvider(type=JoinSQL.class, method="join_insert_sql")
	public int insert(JoinVO joinVO);
	
	public int update(JoinVO joinVO);
	
	@Delete( " DELETE FROM tbl_member WHERE b_userid = #{b_userid} ")
	public void delete();
}
