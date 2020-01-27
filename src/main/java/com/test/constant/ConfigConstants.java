package com.test.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ConfigConstants {
	
	@Value("${excel.path}") private String excelPath;
	@Value("${pdf.path}") private String pdfPath;
}

