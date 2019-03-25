package com.zufe.dao;

import java.util.Date;

import com.zufe.model.*;
import com.zufe.util.Page;

/**
* 帖子信息数据访问接口
*
*/
public interface IMessageDao {
	/**
	 * 添加帖子
	 */
	int add(Message msg);
	
	/**
	 * 删除贴子
	 */
	int delete(int msgid);
	
	/**
	 * 更新帖子
	 */
	int update(Message msg);
	
	/**
	 * 更新状态
	 */
	int updateState(int msgid,int state);
	
	/**
	 * 查询指定帖子信息
	 */
	MessageInfo get(int msgid);
	
	/**
	 * 多条件查询帖子信息
	 */
	Page query(MessageCriteria messageCriteria,Page page);
	
	/**
	 * 查询最新的帖子信息

	 */
	Page queryNew(Page page);
	
	/**
	 * 查询最热的帖子信息

	 */
	Page queryHot(Page page);
	
	/**
	 * 查询最热主题信息

	 */
	Page queryTheme(Page page);
	
	/**
	 * 根据时间查询帖子数量
	 */
	long queryCountByDate(Date startDate,Date endDate);
	
}
