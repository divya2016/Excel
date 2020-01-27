package com.test.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExcelDataModel {
	private String customerName;
	private String sp;
	private String subSp;
	private String parentName;
	private String ownerName;
	private String pc;
	private String projectValue;
	private String startDate;
	private String completionDate;
	private String type;
	private String conInvoice;
	private String invoice;
	private String won;
	private String wonName;
	private String location;
	private String billThroughDate;
	private String ic;
	private String billedAmountPc;
	private String taxAmountPc;
	private String invoiceAmountPc;
	private String billedAmountUsd;
	private String taxAmountUsd;
	private String invoiceAmountUsd;
	private String po;
	private String poValue;
	private String poSd;
	private String poEd;
	private String remark;

}
