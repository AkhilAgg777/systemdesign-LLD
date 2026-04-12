package com.akhil.splitwise.services.settleup.strategies;

import java.util.List;

import com.akhil.splitwise.models.Expense;
import com.akhil.splitwise.models.ExpenseOwingUser;
import com.akhil.splitwise.models.ExpensePayingUser;
import com.akhil.splitwise.services.settleup.Transaction;

public interface SettleUpTransactionsCalculatorStrategy {

	List<Transaction> getTransactions(List<ExpensePayingUser> expensePayingUsers,
			List<ExpenseOwingUser> expenseOwingUsers);
}
