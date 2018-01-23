package com.chapman.ftfcu.repository;

import java.time.LocalDate;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chapman.ftfcu.model.CheckingData;
import com.chapman.ftfcu.repository.CheckingDataRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class CheckingDataRepositoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(CheckingDataRepositoryTest.class);
			
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private CheckingDataRepository checkingDataRepository;
	
	@Test
	public void whenFindByName_thenReturnCheckingData() {
		
		//given
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
		
		entityManager.persist(checkingData);
		entityManager.flush();
		
		//when
		CheckingData data = checkingDataRepository.findByTransactionId("12345");
		LOG.info("--> "+data.toString());
		
		//then
		assertThat(data.getTransactionType()).isEqualTo("Debit");
		
	}
}
