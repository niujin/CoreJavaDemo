package com.mercury.services;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.mercury.beans.User;

@Stateless
@Remote({HelloService.class})
public class HelloServiceBean implements HelloService {

	@Override
	public String welcome(User user) {
		// TODO Auto-generated method stub
		return "Welcome "+user.getName()+"("+user.getAge()+")"+"to EJB!";
	}

}
