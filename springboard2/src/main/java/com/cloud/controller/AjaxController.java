package com.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajax/*")
@Controller
public class AjaxController {

	@GetMapping("/jquery1")	//locahost:8080/ajax/jquary1
	public void query1View() {
		
	}
}
