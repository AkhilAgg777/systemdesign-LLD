package com.akhil.splitwise.services.settleup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.akhil.splitwise.models.Expense;
import com.akhil.splitwise.models.ExpenseOwingUser;
import com.akhil.splitwise.models.ExpensePayingUser;
import com.akhil.splitwise.models.Group;
import com.akhil.splitwise.models.User;
import com.akhil.splitwise.repositories.ExpenseOwingUserRepository;
import com.akhil.splitwise.repositories.ExpensePayingUserRepository;
import com.akhil.splitwise.repositories.GroupRepository;
import com.akhil.splitwise.services.settleup.strategies.SettleUpTransactionsCalculatorStrategy;

@Service
public class SettleUpService {

	private SettleUpTransactionsCalculatorStrategy settleUpTransactionsCalculatorStrategy;
	private GroupRepository groupRepository;
	private ExpensePayingUserRepository expensePayingUserRepository;
	private ExpenseOwingUserRepository expenseOwingUserRepository;

	@Autowired
	public SettleUpService(SettleUpTransactionsCalculatorStrategy settleUpTransactionsCalculatorStrategy) {
		this.settleUpTransactionsCalculatorStrategy = settleUpTransactionsCalculatorStrategy;
	}

	public List<Transaction> settleUpUser(Long userId) {
		return null;
	}

	public List<Transaction> settleUpGroup(Long groupId) {
		// Algo:
		// settleUp(group_id){
		// 1.Get all epu(expense paying user) and eou(expense owing user) for the group
		// 2.Do calculation to compute the transaction
		// }

		Optional<Group> groupOptional = groupRepository.findById(groupId);

		if (!groupOptional.isPresent()) {
			// throw some exception
			System.out.println("No group with that ID");
		}

		Group group = groupOptional.get();
		

		List<ExpensePayingUser> expensePayingUsers = new ArrayList<>();
		List<ExpenseOwingUser> expenseOwingUsers = new ArrayList<>();

		for (Expense expense : group.getExpenses()) {
			expensePayingUsers.addAll(expensePayingUserRepository.findAllByExpense(expense));
			expenseOwingUsers.addAll(expenseOwingUserRepository.findAllByExpense(expense));
		}

		return settleUpTransactionsCalculatorStrategy.getTransactions(expensePayingUsers, expenseOwingUsers);
	}
}
