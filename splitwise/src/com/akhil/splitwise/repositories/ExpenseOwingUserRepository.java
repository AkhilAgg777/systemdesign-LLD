package com.akhil.splitwise.repositories;

import java.util.List;

import com.akhil.splitwise.models.Expense;
import com.akhil.splitwise.models.ExpenseOwingUser;
import com.akhil.splitwise.models.User;

@Repository
public interface ExpenseOwingUserRepository extends JpaRepository<ExpenseOwingUser, Long> {
	List<ExpenseOwingUser> findAllByExpense(Expense expense);
}
