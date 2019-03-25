package com.zufe.service;

import com.zufe.model.*;
import com.zufe.util.*;

/**
 * 管理员业务逻辑接口
 * @author Administrator
 */
public interface IAdminService {
	/**
	 * 管理员登录
	 */
	Admin login(String name,String pwd);
	
	/**
	 * 修改密码
	 */
	int updatepwd(Admin admin);
}
