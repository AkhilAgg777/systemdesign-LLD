package com.akhil.splitwise.repositories;

import java.util.List;

import com.akhil.splitwise.models.Expense;
import com.akhil.splitwise.models.ExpensePayingUser;
import com.akhil.splitwise.models.User;

@Repository
public interface ExpensePayingUserRepository extends JpaRepository<ExpensePayingUser, Long> {
	List<ExpensePayingUser> findAllByExpense(Expense expense);
}
