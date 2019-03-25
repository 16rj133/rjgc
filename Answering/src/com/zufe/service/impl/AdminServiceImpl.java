package com.zufe.service.impl;

import com.zufe.dao.IAdminDao;
import com.zufe.dao.impl.*;
import com.zufe.model.*;
import com.zufe.service.*;
/**
 * 管理员业务实现类
 * @author Administrator
 *
 */
public class AdminServiceImpl implements IAdminService {
		IAdminDao adminDao= new AdminDaoImpl();
	@Override
	public Admin login(String username, String password) {
		return adminDao.login(username, password);
	}
	@Override
	public int updatepwd(Admin admin) {
		return adminDao.updatepwd(admin);
	}


}
