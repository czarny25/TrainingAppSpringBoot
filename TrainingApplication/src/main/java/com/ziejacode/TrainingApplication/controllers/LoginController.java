package com.ziejacode.TrainingApplication.controllers;

import java.nio.file.AccessDeniedException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.dao.DuplicateKeyException;
//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import model.EmailMessage;
//import model.Training;
import com.ziejacode.TrainingApplication.model.User;
import com.ziejacode.TrainingApplication.services.UserService;
import com.ziejacode.TrainingApplication.services.UserServiceImpl;

@Controller
public class LoginController {
	
	
	private UserServiceImpl userService;
	
	@Autowired
	public void setUserService(UserServiceImpl userService){
		this.userService = userService;
	}
	
//	@Autowired
//	private MailSender mailSender;
	
//	@Autowired
//	public void setMailSender(MailSender mailSender) {
//		this.mailSender = mailSender;
//		System.out.println("mailSender is set");
//	}
	
	
	//////////// login stuff ///////////////////////////	
	
//	@RequestMapping(value="/logIn")
//	public String logIn(){
//		return "logIn";
//	}
//	
//	
//	@RequestMapping(value="/accessDenied")
//	public String accessDenied(){		
//		return "accessDenied";
//	}
//	
//	@RequestMapping(value="/logOut")
//	public String logOut(){		
//		return "logIn";
//	}	
	////////////////////////////////////////////////////
	
	
	
	
	
	
	//////////// create account stuff ///////////////////////////
	
//	@RequestMapping(value="/createNewAccount")
//	public String createAccount(Model model){
//		
//		model.addAttribute("user", new User());		
//		return "createNewAccount";
//	}
	
//	@RequestMapping(value="/doCreateAccount", method=RequestMethod.POST)
//	public String accountCreated(@Valid User user, BindingResult res){
//		
//		if(res.hasErrors()){
//			return "createNewAccount";
//		}
//		
//		user.setAuthority("ROLE_USER");
//		user.setEnabled(true);			
//						
//		try {
//			userService.create(user);
//		} catch (DuplicateKeyException e) {
//			res.rejectValue("userName", "DuplicateKey.user.userName", "this user already exists");
//			e.printStackTrace();
//			return "createNewAccount";
//		}
//			//System.out.println(user.toString());			
//			return "accountCreated";
//	}	
	///////////////////////////////////////////////////////////////////////	
	
	
	
	
	
	
	//////////// administrator stuff ///////////////////////////
	
//	@RequestMapping("/adminPage")
//	public String showAdminPage(Model model){		
//		
//		//throw new AccessDeniedException("Wrong");
//		
//		try {
//			return "adminPage";
//		} catch (AccessDeniedException e) {
//			e.printStackTrace();
//			return "accessDenied";
//		}
//	}
//	
//	
//	@RequestMapping(value="/createUser")
//	public String createUser(Model model){
//		
//		model.addAttribute("user", new User());		
//		return "createUser";
//	}
//	
//	
//	
//	@RequestMapping(value="/doCreateUser", method=RequestMethod.POST)
//	public String userCreated(@Valid User user, BindingResult res){
//		
//		if(res.hasErrors()){
//			return "createNewAccount";
//		}
//		
//		user.setAuthority("ROLE_USER");
//		user.setEnabled(true);			
//						
//		try {
//			userService.create(user);
//		} catch (DuplicateKeyException e) {
//			res.rejectValue("userName", "DuplicateKey.user.userName", "this user already exists");
//			e.printStackTrace();
//			return "createNewAccount";
//			
//		}
//			//System.out.println(user.toString());			
//			return "accountCreated";
//	}
//	
//	
	@RequestMapping("/index")
	public String showUsersPage(Model model){
		
		List<User> users =  userService.getUsers();
		System.out.println(users.toString()); // test to remove	
		
		model.addAttribute("users", users);
		
		return "index";
	}
	
//	@RequestMapping(value="/deleteUser", method = RequestMethod.GET)
//	public String deleteUser(String userName){
//		
//		System.out.println("userName to delete is " + userName);
//		
//		userService.deleteUser(userName);
//		
//		return "userDeleted";
//	}
	
	///////////////////////////////////////////////////////////
	
	
	
	
	//////////// mail dispatcher ///////////////////////////
	
	
//	@RequestMapping(value="/contact")
//	public String createEmil(Model model){
//		
//		model.addAttribute("emailMessage", new EmailMessage());			
//		return "contact";
//	}
	
	
	
	
//	@RequestMapping(value="/sendmessage", method=RequestMethod.POST)	
//	public String sendMessage(EmailMessage emailMessage) {
//		
//		System.out.println("send message start");
//		
//		String name = emailMessage.getName();
//		String surname = emailMessage.getSurname();
//		String email = emailMessage.getEmail();
//		String message = emailMessage.getMessage();
//				
//		System.out.println(emailMessage.toString());
//
//		SimpleMailMessage mail = new SimpleMailMessage();
//		mail.setFrom("ziejacode@gmail.com");
//		mail.setTo("ziejacode@gmail.com");		
//		mail.setSubject("Message from " + name  + " " + surname + ": ");
//		mail.setText("This message is sent from " + email + "\n \n " + message);
//		
//		try {
//			mailSender.send(mail);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Can't send message");
//		}
//		
//		return "messageSent";
//	}	
	
	///////////////////////////////////////////////////////////	
}
	
	
	
	
	
