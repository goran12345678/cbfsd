package com.fullstack.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import com.fullstack.model.User;

public class UserServiceImpl implements UserService{

	static LinkedHashMap<Long, User> users = new LinkedHashMap<Long, User>();
	
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		if(user.getId() == 0 || user.getPassword().isEmpty()) {
			return false;
		}else {
			users.put(user.getId(), user);
		}
		return true;
	}

	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		User userToCheck = users.get(user.getId());
		
		return userToCheck.getPassword().equals(user.getPassword());
	}

	@Override
	public boolean deleteUser(long userId) {
		// TODO Auto-generated method stub
		if(!users.containsKey(userId)) {
			return false;
		}
		users.remove(userId);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		if(!users.containsKey(user.getId())) {
			return false;
		}
		users.put(user.getId(), user);
		return true;
	}

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		if(!users.containsKey(userId)) {
			return null;
		}else {
			return users.get(userId);
		}
	}

	@Override
	public User[] getUsers() {
		// TODO Auto-generated method stub
		User[] userArray = new User[users.size()];
		Set<Long> Ids = users.keySet();
		
		int idx = 0;
		Iterator<Long> itr = Ids.iterator();
		
		while(itr.hasNext()) {
			Long id = itr.next();
			userArray[idx] = users.get(id);
			idx++;
		}
		
		return userArray;
	}

}
