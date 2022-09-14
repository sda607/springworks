package com.spring.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {

	private String userid, username, userpw, email, gender;
	private Date birth;
}
