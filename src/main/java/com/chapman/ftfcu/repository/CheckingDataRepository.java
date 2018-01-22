package com.chapman.ftfcu.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chapman.ftfcu.model.CheckingData;

public interface CheckingDataRepository extends CrudRepository<CheckingData, Long> {

	List<CheckingData> findAll();
	List<CheckingData> findByTransactionId(String transactionId);
	List<CheckingData> findByPostingDateGreaterThan(Date date);
	List<CheckingData> findByPostingDateLessThan(Date date);
	//List<CheckingData> loadRawCheckingData(String file);
	
	CheckingData save(CheckingData data);
	//int saveAndUpdateCategories(CheckingData b);
	
	
	/*List<CheckingData> findByGreaterLess(String greaterOrLess);
	List<CheckingData> getUnassighnedData(Date from, Date to, String greaterOrLess);
	List<CheckingData> getDateRangeData(Date from, Date to, String greaterOrLess);
	Double getCheckingCategorySum(Long categoryId, Date from, Date to, String greaterOrLess);
	List<CheckingData> getDataByCategory(Long categoryId, Date from, Date to, String greaterOrLess);*/
	
}
