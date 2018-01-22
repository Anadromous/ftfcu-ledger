package com.champman.ftfcu.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.chapman.ftfcu.controller.CheckingDataController;
import com.chapman.ftfcu.model.CheckingData;
import com.chapman.ftfcu.repository.CheckingDataRepository;
import com.chapman.ftfcu.service.CheckingDataService;

@RunWith(SpringRunner.class)
@WebMvcTest(CheckingDataController.class)
public class CheckingDataControllerTest {

	@Autowired 
	private CheckingDataRepository rawDataRepository;
	
	@Autowired
    private MockMvc mvc;
 
    @MockBean
    private CheckingDataService checkingDataService;
    
    @Test
    public void givenCheckingData_whenGetCheckingData_thenReturnJsonArray() throws Exception{
    	CheckingData checkingData = new CheckingData("12345", 
    			LocalDate.now(), 
    			LocalDate.now(), 
    			"Debit", 
    			10.59,
    			Long.valueOf(7850), 
    			"321654", 
    			"Ava Roasteria", 
    			"coffee", 
    			"Ava", 
    			"Dining Out", 
    			"Debit", 
    			8151.00);
    	
    	List<CheckingData> allChecking=Arrays.asList(checkingData);
    	given(checkingDataService.findAll()).willReturn(allChecking);
    	
    	
    }
}
