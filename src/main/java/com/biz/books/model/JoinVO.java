package com.biz.books.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JoinVO {

	private long b_id;
	private String b_userid;
	private String b_password;
	private String b_repassword;
	private String b_tel;
	private String b_addr;
	
}
