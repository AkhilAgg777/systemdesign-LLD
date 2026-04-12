package com.akhil.splitwise.models;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
	private double amount;
	@ManyToOne
	private User createdBy;
	private String description;
	private Date createdAt;
	@ManyToOne
	private Currency baseCurrency;
	@ManyToMany
	private List<User> participants;
}
