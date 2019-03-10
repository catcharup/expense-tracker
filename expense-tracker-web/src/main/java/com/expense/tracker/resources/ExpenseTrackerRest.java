package com.expense.tracker.resources;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class ExpenseTrackerRest {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ExpenseTrackerRest.class);
	
	@Autowired
	ExpenseTrackerService expenseService;
	
	@PostMapping("/expenseData")
	public ResponseEntity<String> insertUpdateExpenseDetails(){
		ResponseEntity<String> reposeValue = new ResponseEntity<String>("Successfully inserted record", HttpStatus.OK);
		
		return reposeValue;
	}

	
	@PostMapping(path="/expenseDetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object>> getExpenseDetails(@RequestParam(name="user") String user){
		LOGGER.info("User value is : ===============>  " + user);
		List<Object> expenseList = expenseService.getExpenseDetailsForDateRange(LocalDate.now(), LocalDate.now());
		
		ResponseEntity<List<Object>> reposeValue = new ResponseEntity<List<Object>>(expenseList, HttpStatus.OK);
		
		return reposeValue;
	}
}
