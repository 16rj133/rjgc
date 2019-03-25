package com.zufe.dao;

import java.util.Date;

import com.zufe.model.*;
import com.zufe.util.Page;

public interface IReplyDao {
	/**
	 * 回帖
	 */
	int replyMsg(Reply reply);
	
	/**
	 * 根据帖子ID查询回复内容
	 */
	Page queryBymsgid(int msgid,Page page);
	
	/**
	 * 根据时间查询回帖数量
	 */
	long queryCountByDate(Date startDate,Date endDate);
}
