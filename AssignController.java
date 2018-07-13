package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AssignService;

@RestController
@RequestMapping("/api")
public class AssignController {
	
	@Autowired
	AssignService service;
	
	@RequestMapping(value="/reverse", method=RequestMethod.GET)
	public ResponseEntity<String> reverseText(@RequestParam  String text) {
		String reverse="";
		if (text.isEmpty()) {
			return new ResponseEntity<String>("Error : Enter the Param Value",HttpStatus.CONFLICT);
		} else {
			reverse = service.reverseText(text);
		}
		return new ResponseEntity<String>(reverse.trim(),HttpStatus.OK);
	}
	
}
