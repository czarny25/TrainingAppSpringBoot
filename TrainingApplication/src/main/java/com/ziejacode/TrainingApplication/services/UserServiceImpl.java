package com.ziejacode.TrainingApplication.services;

import java.util.List;
import java.util.Set;

import com.ziejacode.TrainingApplication.model.User;
import com.ziejacode.TrainingApplication.model.UserRepository;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.stereotype.Service;
//
//import guru.springframework.model.User;
//import model.UserDao;


//@Service("userService")
public class UserServiceImpl implements UserService{	
	
	
	private UserRepository userRepository;

	
	public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	
//	@Autowired
//	public void setUserModel(UserDao userModel) {
//		//this.userModel = userModel;
//	}
//	
	
	@Override
	public List<User> getUsers() {
		List<User> users = userRepository.getUsers();
		return null;
	}
	
	
//	
//	public void  create(User user) {		
//		//userModel.createUser(user);
//	}
//
//	@Secured("ROLE_ADMIN")
//	public List<User> getAllUsers() {
//		List<User> users = userModel.getAllUsers();
//		return users;
//	}
//
//	
//	@Secured("ROLE_ADMIN")
//	public boolean deleteUser(String userName) {
//		
//		return userModel.deleteUser(userName);
//	}
	
}



