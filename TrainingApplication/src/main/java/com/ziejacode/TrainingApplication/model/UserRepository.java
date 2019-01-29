package com.ziejacode.TrainingApplication.model;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

	
	private List<User> users;
	
	
	public List<User> getUsers() {

		users = new ArrayList<>();
		String[] names = {"Marina", "Cadafi", "roman", "hela"};
		int counter = 0;
		for(String name: names) {
			User user = new User();
			user.setUserName(name);
			counter++;
			users.add(counter, user);
		}
		
		return null;
	}

	
	
	
}
