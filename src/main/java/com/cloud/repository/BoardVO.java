package com.cloud.repository;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
	
	
}
