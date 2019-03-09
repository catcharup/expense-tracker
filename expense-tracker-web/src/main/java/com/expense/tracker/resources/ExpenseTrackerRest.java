package com.expense.tracker.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class ExpenseTrackerRest {
	
	
	@PostMapping("/expenseData")
	public ResponseEntity<String> insertYpdateExpenseDetails(){
		
		ResponseEntity<String> reposeValue = new ResponseEntity<String>("Successfully Insert or Updated Expense", HttpStatus.OK);
		
		
		return reposeValue;
	}

	
	@GetMapping("/expenseDetails")
	public ResponseEntity<String> getExpenseDetails(){
		
		ResponseEntity<String> reposeValue = new ResponseEntity<String>("No Expense Found", HttpStatus.OK);
		
		
		return reposeValue;
	}
}
