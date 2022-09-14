package com.spring.domain;



import java.util.Date;

import lombok.Data;

//Lombok을 이용해서 생성자와 get/set, to string 만들어냄 -> @Data
@Data
public class BoardVO {
	
	private Long bno;         
	private String title, content, writer;
	private Date regdate, updateDate;
	
}
