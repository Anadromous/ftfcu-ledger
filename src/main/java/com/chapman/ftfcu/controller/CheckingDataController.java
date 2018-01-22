package com.chapman.ftfcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chapman.ftfcu.model.CheckingData;
import com.chapman.ftfcu.repository.CheckingDataRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/checking")
public class CheckingDataController {

	private static final Logger LOG = LoggerFactory.getLogger(CheckingDataController.class);

	public CheckingDataController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired 
	private CheckingDataRepository rawDataRepository;
	
	List<CheckingData> checking = new ArrayList<>();
	
	@RequestMapping(method = RequestMethod.GET)
	public List<CheckingData> getCheckingData() {
		LOG.warn("Getting users...");
		System.out.println("Getting users prnt...");
		return rawDataRepository.findAll();
	}
	
/*	List<CheckingData> findDataByTransactionId(String transactionId);
	List<CheckingData> loadRawCheckingData(String file);
	//CheckingData insertRawCheckingData(CheckingData data) throws Exception;
	CheckingData saveData(CheckingData data) throws Exception;
	List<CheckingData> getAllData(String greaterOrLess);
	List<CheckingData> getUnassighnedData(Date from, Date to, String greaterOrLess);
	int saveAndUpdateAllCategories(CheckingData b);
	List<CheckingData> getDateRangeData(Date from, Date to, String greaterOrLess);
	Double getCheckingCategorySum(Long categoryId, Date from, Date to, String greaterOrLess);
	List<CheckingData> getDataByCategory(Long categoryId, Date from, Date to, String greaterOrLess);*/
}
