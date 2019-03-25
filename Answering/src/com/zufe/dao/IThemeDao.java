package com.zufe.dao;

import java.util.List;

import com.zufe.model.*;
import com.zufe.util.Page;

/**
 * 主题数据访问接口
 *
 */
public interface IThemeDao {
	
	/**
	 * 新增主题
	 */
	int add(Theme theme);
	
	/**
	 * 删除主题
	 */
	int delete(int theid);
	
	/**
	 * 查询全部主题
	 */
	List getAll();
	
	/**
	 * 根据关键字查询主题信息
	 */
	Page query(String key,Page page);
}
