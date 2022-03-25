package com.sapient.aem.ui;

import com.sapient.aem.model.Role;
import com.sapient.aem.model.User;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      User user = new User(1,"Ranjan","ran@34",Role.ADMIN);
      System.out.println(user);
	}

}
