package com.comolroy.saajs.core.services.util;

import java.util.ArrayList;
import java.util.List;

import com.comolroy.saajs.core.entities.Account;

public class AccountList {
	private List<Account> accounts= new ArrayList<Account>();
	
	public AccountList(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "AccountList [accounts=" + accounts + "]";
	}
	
	
}
