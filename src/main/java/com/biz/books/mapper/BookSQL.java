package com.biz.books.mapper;

import org.apache.ibatis.jdbc.SQL;

public class BookSQL {

	public String post_insert_sql() {
		SQL sql = new SQL()
				.INSERT_INTO("tbl_books")
				.INTO_COLUMNS("b_id").INTO_VALUES("SEQ_BOOKS.NEXTVAL")
				.INTO_COLUMNS("b_userid").INTO_VALUES("#{b_userid}")
				.INTO_COLUMNS("b_isbn").INTO_VALUES("#{b_isbn}")
				.INTO_COLUMNS("b_title").INTO_VALUES("#{b_title}")
				.INTO_COLUMNS("b_date").INTO_VALUES("#{b_date}")
				.INTO_COLUMNS("b_star").INTO_VALUES("#{b_star}")
				.INTO_COLUMNS("b_text").INTO_VALUES("#{b_text}");
		return sql.toString();
	}
	
	
	
	
}
