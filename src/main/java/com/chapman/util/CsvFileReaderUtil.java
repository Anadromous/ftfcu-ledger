package com.chapman.util;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.chapman.ftfcu.model.CheckingData;

/**
 * @author ashraf_sarhan
 *
 */
public class CsvFileReaderUtil {
	
	protected final Log log = LogFactory.getLog(getClass());

	public List<CheckingData> readCsvFile(String fileName) {
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
		//Create the CSVFormat object with the header mapping
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader();
        List<CheckingData> checkRecords = new ArrayList<CheckingData>();
        log.debug("entering the try............");
        try {
            //initialize FileReader object
        	log.debug("file name: "+fileName);
            fileReader = new FileReader(fileName);
            //initialize CSVParser object
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            //Get a list of CSV file records
            List<CSVRecord> csvRecords = csvFileParser.getRecords(); 
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            log.debug("csvRecords............ "+csvRecords.size());
            for (CSVRecord record : csvRecords) {
            	log.debug(record.toString());
          	
            	CheckingData data = new CheckingData();
            	//"Transaction ID", "Posting Date", "Effective Date", "Transaction Type", "Amount", 
            	//"Check Number", "Reference Number", "Payee", "Memo", "Transaction Category", "Type", "Balance"
				data.setTransactionId(record.get("Transaction ID"));
				data.setPostingDate(LocalDate.parse(record.get("Posting Date"),formatter));
				data.setEffectiveDate(LocalDate.parse(record.get("Effective Date"),formatter));
				data.setTransactionType(record.get("Transaction Type"));
				data.setAmount(Double.parseDouble(record.get("Amount")));
				String checkNumber = record.get("Check Number");
				data.setReferenceNumber(record.get("Reference Number"));
				data.setPayee(record.get("Payee"));
				data.setMemo(record.get("Memo"));
				data.setTransactionCategory(record.get("Transaction Category"));
				data.setType(record.get("Type"));
				data.setBalance(Double.parseDouble(record.get("Balance")));
				if(!StringUtils.isEmpty(checkNumber))
				data.setCheckNumber(new Long(checkNumber));
				checkRecords.add(data);	
			}
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                csvFileParser.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader/csvFileParser !!!");
                e.printStackTrace();
            }
        }
        return checkRecords;
	}

}
