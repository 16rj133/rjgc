package com.zufe.dao;

/**
 * 帖子统计数据访问层接口
 * @author Administrator
 *
 */
public interface ICountDao {
	
	/**
	 * 更新帖子访问量
	 */
	int updateAccessCount(int msgid);
}
