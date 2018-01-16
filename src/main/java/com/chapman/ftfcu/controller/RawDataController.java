package com.chapman.ftfcu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/rdata")
public class RawDataController {

	private static final Logger LOG = LoggerFactory.getLogger(RawDataController.class);
	
	
	
/*	List<RawBankCheckingData> findDataByTransactionId(String transactionId);
	List<RawBankCheckingData> loadRawCheckingData(String file);
	//RawBankCheckingData insertRawCheckingData(RawBankCheckingData data) throws Exception;
	RawBankCheckingData saveData(RawBankCheckingData data) throws Exception;
	List<RawBankCheckingData> getAllData(String greaterOrLess);
	List<RawBankCheckingData> getUnassighnedData(Date from, Date to, String greaterOrLess);
	int saveAndUpdateAllCategories(RawBankCheckingData b);
	List<RawBankCheckingData> getDateRangeData(Date from, Date to, String greaterOrLess);
	Double getCheckingCategorySum(Long categoryId, Date from, Date to, String greaterOrLess);
	List<RawBankCheckingData> getDataByCategory(Long categoryId, Date from, Date to, String greaterOrLess);*/
}
