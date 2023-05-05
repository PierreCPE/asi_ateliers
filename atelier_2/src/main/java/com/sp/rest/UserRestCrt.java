package com.sp.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;
import com.sp.service.UserService;
import com.sp.service.LoginService;

@RestController
public class UserRestCrt {
	@Autowired
	UserService uService;
	@Autowired
	LoginService lService;
	
	@RequestMapping(method=RequestMethod.POST,value="/user") //Lors de la connexion prend la méthode post avec les valeurs
	public void addUser(@RequestBody User user) {
		uService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{id}")
	public User getUser(@PathVariable String id) {
		User u=uService.getUser(Integer.valueOf(id));
		return u;
	}
	
	@GetMapping("/") //Le getmapping donne par défaut la requestmethod.get
	public String readCookie(@CookieValue(value = "id", defaultValue = "0") String retId) {
	    return "Hey! My id is " + retId;
	}

}