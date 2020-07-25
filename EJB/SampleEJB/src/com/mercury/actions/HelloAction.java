package com.mercury.actions;

import java.util.Properties;

import javax.naming.InitialContext;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.daos.HelloDao;
import com.mercury.services.HelloService;

public class HelloAction {
	
	public HelloAction(){
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		try {
			InitialContext ctx = new InitialContext(props);
			hd = (HelloDao)ctx.lookup("HelloDaoBean/remote");
			hs = (HelloService)ctx.lookup("HelloServiceBean/remote");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	HelloDao hd;
	HelloService hs;
	public UserInfo execute(User user){
		
		UserInfo userinfo = new UserInfo();
		hd.save(user);
		userinfo.setMsg(hs.welcome(user));
		userinfo.setUsers(hd.query());
		return userinfo;
	}
}
