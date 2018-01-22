package com.chapman.ftfcu.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chapman.ftfcu.model.CheckingData;
import com.chapman.ftfcu.repository.CheckingDataRepository;
import com.chapman.ftfcu.service.CheckingDataService;

public class CheckingDataServiceImpl implements CheckingDataService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CheckingDataServiceImpl.class);

	private CheckingDataRepository checkingDataRepository;
	
	public void setCheckingDataRepository(CheckingDataRepository checkingDataRepository) {
		this.checkingDataRepository=checkingDataRepository;	
	}
	
	@Override
	public List<CheckingData> findAll() {
		LOG.info("checkingDataServiceImpl: findAll()");
		return checkingDataRepository.findAll();
	}

}
