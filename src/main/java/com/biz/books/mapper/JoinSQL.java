package com.biz.books.mapper;

import org.apache.ibatis.jdbc.SQL;

public class JoinSQL {

	public String join_insert_sql() {
		SQL sql = new SQL()
				.INSERT_INTO("tbl_member")
				.INTO_COLUMNS("b_id").INTO_VALUES("SEQ_MEMBER.NEXTVAL")
				.INTO_COLUMNS("b_userid").INTO_VALUES("#{b_userid}")
				.INTO_COLUMNS("b_password").INTO_VALUES("#{b_userid}")
				.INTO_COLUMNS("b_repassword").INTO_VALUES("#{b_repassword}")
				.INTO_COLUMNS("b_addr").INTO_VALUES("#{b_addr}")
				.INTO_COLUMNS("b_tel").INTO_VALUES("#{b_tel}");
		return sql.toString();
	}
	
}
