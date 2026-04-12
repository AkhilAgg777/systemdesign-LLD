package com.akhil.splitwise.controllers;

import dtos.SettleUpUserRequestDto;

@Controller
public class SettleUpController {
	public void settleUser(SettleUpUserRequestDto request) {
		// UserController
		// List<Something>
		// Something:amount,user,
		// [
		// { from:Swaroop amount:50}
		// { from:Laksh amount:50}
		// { from:Ranjan amount:-100}
		// ]
		// [
		// { from:Swaroop to:Naman amount:50}->Transaction
		// { from:Laksh to:Naman amount:100}
		// { from:Naman to:Rajan amount:-100}
		// ]

	}

	public void settleGroup() {
		// Group Controller

	}
}
