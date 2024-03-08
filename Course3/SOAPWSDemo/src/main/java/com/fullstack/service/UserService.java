package com.fullstack.service;

import com.fullstack.model.User;

public interface UserService {
	
	public boolean registerUser(User user);
	public boolean loginUser(User user);
	public boolean deleteUser(long userId);
	public boolean updateUser(User user);
	public User getUser(long userId);
	public User[] getUsers();
	
}
