package com.zufe.service;

import com.zufe.model.*;
import com.zufe.util.*;

public interface IUserService {
	/**
	 * 用户注册
	 */
	int userRegister(User user);
	
	/**
	 * 用户登录
	 */
	User userLogin(String username,String password);
	
	/**
	 * 更新用户信息
	 */
	int update(User user);
	
	/**
	 * 根据用户名和分页信息查询数据
	 */
	Page searchByName(String username,Page page);
	
	/**
	 * 删除信息
	 */
	int deleteUser(int userid);
	
	/**
	 * 恢复状态
	 */
	int restoreUser(int userid);
	//修改密码
	int updatePw(User user);

	int modifyUser(int userid, int state);
	/**
	 * 验证用户名是否存在
	 */
    boolean isExist(String username);
}

 
