package com.mercury.daos;

import java.util.List;

import com.mercury.beans.User;

public interface HelloDao {
	public void save(User user);
	public List<User> query();
}
