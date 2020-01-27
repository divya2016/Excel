package com.test.sevice.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.constant.ConfigConstants;
import com.test.constant.MessageConstants;
import com.test.model.response.ServiceResponse;
import com.test.sevice.ReaderService;
import com.test.utils.CommonUtils;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ReaderServiceImpl implements ReaderService {
	@Autowired
	private CommonUtils commonUtils;
	@Autowired
	private ConfigConstants configConstants;

	@Override
	public ServiceResponse<List<String>> compareData() {
		try {
			if (StringUtils.isEmpty(configConstants.getExcelPath())) {
				return null;
			}
				FileInputStream file = new FileInputStream(new File(configConstants.getExcelPath()));
				XSSFWorkbook excelBook = new XSSFWorkbook(file);
				XSSFSheet excelSheet = excelBook.getSheetAt(0);
				Iterator<Row> rowIterator = excelSheet.iterator();
				while (rowIterator.hasNext()) {
					Row row = rowIterator.next();
					Cell customerName = row.getCell(0);
					Cell sp=row.getCell(2);
					log.info(customerName.getStringCellValue() +" "+sp.getStringCellValue());
				}
				excelBook.close();
				file.close();
		} catch (Exception e) {
			log.error(MessageConstants.ERROR_TRY_AGAIN,e);
			return commonUtils.generateErrorMessage();
		}
		return null;
	}

}
