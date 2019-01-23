package com.smc.beans;

import org.springframework.stereotype.Service;

@Service
public class ValidPassword {

	public boolean isValid(String login, String password) {
		if(login.equals("Chris") && password.equals("a")) {
			return true;
		} else {
		return false;
		}
	}
}
