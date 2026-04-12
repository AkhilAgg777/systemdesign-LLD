package com.akhil.splitwise.models;

@Getter
@Setter
@Entity
public class ExpenseOwingUser extends BaseModel {
	@ManyToOne
	private Expense expense;
	@ManyToOne
	private User user;
	private double amount;
}
