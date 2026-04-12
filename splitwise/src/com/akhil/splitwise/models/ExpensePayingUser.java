package com.akhil.splitwise.models;

@Getter
@Setter
@Entity
public class ExpensePayingUser extends BaseModel {
	@ManyToOne
	private Expense expense;
	@ManyToOne
	private User user;
	private double amount;
}
