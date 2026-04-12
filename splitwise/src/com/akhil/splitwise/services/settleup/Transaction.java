package com.akhil.splitwise.services.settleup;

import com.akhil.splitwise.models.User;

@Getter
@Setter
public class Transaction {
	private User from;
	private User to;
	private double amount;
}
