package com.augmentum.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.augmentum.dao.IUserDao;
import com.augmentum.model.User;
import com.augmentum.model.UserModel;
import com.augmentum.service.IUserService;

@Service
public class UserService implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public List<UserModel> findAll() {
		return userDao.findAll();
	}

	@Override
	public void insertUser(UserModel user) {
		 userDao.insertUser(user);
	}

	@Override
	public void removeUser(String userName) {
		 userDao.removeUser(userName);
	}

	@Override
	public void updateUser(UserModel user) {
		 userDao.updateUser(user);
	}

	@Override
	public List<UserModel> findForRequery(String userName) {
		return  userDao.findForRequery(userName);
	}

}
