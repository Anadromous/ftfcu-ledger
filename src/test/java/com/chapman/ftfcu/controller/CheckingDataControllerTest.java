package com.chapman.ftfcu.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.chapman.ftfcu.model.CheckingData;
import com.chapman.ftfcu.service.CheckingDataService;

@RunWith(SpringRunner.class)
@WebMvcTest(CheckingDataController.class)
public class CheckingDataControllerTest {

/*	@Autowired
	private CheckingDataRepository checkingDataRepository;*/
	
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
    	
    	List<CheckingData> allChecking = Arrays.asList(checkingData);
    	
    	given(checkingDataService.findAll()).willReturn(allChecking);
    	
    	mvc.perform(get("/checking/house").contentType(MediaType.APPLICATION_JSON))
    	.andExpect(status().isOk())
    	.andExpect(model().size(1));
    	//.andExpect(jsonPath("$.payload[0].type").value("Debit"));
    }
    
    /**
     * this.mvc.perform(get("/api/warehouses?filterType=0&ids=1")
                .header("Accept-Language", "en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))

                //check if the jason node exsits
                .andExpect(jsonPath("$.errorCode").exists())
                .andExpect(jsonPath("$.payload[0].name").exists())
                .andExpect(jsonPath("$.payload[0].code").exists())
                .andExpect(jsonPath("$.payload[0].id").exists())

                //check the type of json node
                .andExpect(jsonPath("$.errorCode").isString())
                .andExpect(jsonPath("$.payload[0].name").isString())
                .andExpect(jsonPath("$.payload[0].code").isString())
                .andExpect(jsonPath("$.payload[0].id").isNumber())

                //check the return value
                .andExpect(jsonPath("$.errorCode").value(""))
                .andExpect(jsonPath("$.payload[0].name").value("test_name"))
                .andExpect(jsonPath("$.payload[0].code").value("test_code"))
                .andExpect(jsonPath("$.payload[0].address").value("adress value"))
                .andExpect(jsonPath("$.payload[0].id").value(1));
    }
     * 
     */
}
