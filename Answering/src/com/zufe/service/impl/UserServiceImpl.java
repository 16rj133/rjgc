package com.zufe.service.impl;

import com.zufe.dao.*;
import com.zufe.dao.impl.*;
import com.zufe.model.*;
import com.zufe.service.*;
import com.zufe.util.Page;

public class UserServiceImpl implements IUserService {

	IUserDao iUserDao = new UserDaoImpl();
	
	@Override
	public User userLogin(String username, String pw) {
		// TODO Auto-generated method stub
		return iUserDao.query(username, pw);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return iUserDao.update(user);
	}

	@Override
	public int userRegister(User user) {
		// TODO Auto-generated method stub
		return iUserDao.add(user);
	}

	@Override
	public Page searchByName(String username, Page page) {
		return iUserDao.queryByName(username, page);
	}

	@Override
	public int deleteUser(int userid) {
		return iUserDao.updateState(userid, -1);
	}

	@Override
	public int restoreUser(int userid) {
		return iUserDao.updateState(userid, 0);
	}

	@Override
	public int updatePw(User user) {
		return iUserDao.updatePw(user);
	}

	@Override
	public int modifyUser(int userid, int state) {
		return iUserDao.updateState(userid, state);
	}

	@Override
	public boolean isExist(String username) {
		return iUserDao.isExist(username);
	}

}
