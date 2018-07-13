package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class AssignService {
	
	public String reverseText(String text) {
		String reverse = "";
		String[] splitWords = text.split(" ");
		for(int index = 0; index < splitWords.length; index++) {
			reverse =reverse + new StringBuilder(splitWords[index]).reverse().toString() + " " ;
		}
		return reverse;
	}
}
