package com.chapman.ftfcu.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chapman.ftfcu.model.RawBankCheckingData;

public interface RawDataRepository extends CrudRepository<RawBankCheckingData, Long> {

	List<RawBankCheckingData> findAll();
	List<RawBankCheckingData> findByTransactionId(String transactionId);
	List<RawBankCheckingData> findByPostingDateGreaterThan(Date date);
	List<RawBankCheckingData> findByPostingDateLessThan(Date date);
	List<RawBankCheckingData> loadRawCheckingData(String file);
	
	RawBankCheckingData save(RawBankCheckingData data);
	int saveAndUpdateCategories(RawBankCheckingData b);
	
	
	/*List<RawBankCheckingData> findByGreaterLess(String greaterOrLess);
	List<RawBankCheckingData> getUnassighnedData(Date from, Date to, String greaterOrLess);
	List<RawBankCheckingData> getDateRangeData(Date from, Date to, String greaterOrLess);
	Double getCheckingCategorySum(Long categoryId, Date from, Date to, String greaterOrLess);
	List<RawBankCheckingData> getDataByCategory(Long categoryId, Date from, Date to, String greaterOrLess);*/
	
}
