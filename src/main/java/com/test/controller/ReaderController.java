package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.response.ServiceResponse;
import com.test.sevice.ReaderService;

@RestController
public class ReaderController {

	@Autowired
	private ReaderService readerService;

	@GetMapping("/compareData")
	public ServiceResponse<List<String>> compareData() {
		return readerService.compareData();
	}

}
