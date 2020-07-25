package com.mercury.tests;

import java.util.List;
import java.util.Properties;

import javax.naming.InitialContext;

import com.mercury.beans.User;
import com.mercury.daos.HelloDao;

public class Test01 {
	public static void main(String args[]) throws Exception{
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		InitialContext ctx = new InitialContext(props);
		HelloDao hd = (HelloDao)ctx.lookup("HelloDaoBean/remote");
		User user = new User();
		user.setName("Johnson");
		user.setAge(78);
		hd.save(user);
		List<User> users = hd.query();
		for (User u:users) {
			System.out.println(u.getName() + "\t" + u.getAge());
		}
	}
}
