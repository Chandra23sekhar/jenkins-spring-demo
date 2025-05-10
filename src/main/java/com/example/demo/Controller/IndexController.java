package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IndexService;

@RestController
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	@GetMapping("/")
	public String showMessage() {
		return indexService.showMessage();
	}
}
