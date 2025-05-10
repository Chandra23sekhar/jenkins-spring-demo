package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class IndexService {
	
	@Value("${message}")
	private String message;
	
	public String showMessage() {
		return message;
	}

}
