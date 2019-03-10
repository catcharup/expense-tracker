package com.expense.tracker.resources;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.expense.tracker.model.CreditCardExpenseDetail;
import com.expense.tracker.model.DebitCardExpenseDetail;

@Component
public class ExpenseTrackerService {
	
	public List<Object> getExpenseDetailsForDateRange(LocalDate startDate, LocalDate endDate){
		CreditCardExpenseDetail ccExpense = new CreditCardExpenseDetail();
		DebitCardExpenseDetail dcExpense = new DebitCardExpenseDetail();
		List<Object> expenseList = new ArrayList<>();
		expenseList.add(ccExpense);
		expenseList.add(dcExpense);
		
		return expenseList;
	}

}
