package com.zufe.service;

import java.util.Date;

import com.zufe.model.*;
import com.zufe.util.*;

/**
 * 帖子信息业务接口层
 *
 */
public interface IMessageService {
	/**
	 * 发帖
	 */
	int addMsg(Message message);
	/**
	 * 回帖
	 */
	int replyMsg(Reply reply);
	
	/**
	 * 根据帖子ID查询帖子信息 
	 */
	MessageInfo getMsg(int msgid);
	
	/**
	 * 根据帖子ID查询回复信息
	 */
	Page getReply(int msgid,Page page);
	
	/**
	 * 查询最新
	 */
	Page queryNew(Page page);
	
	Page queryHot(Page page);
	
	Page queryTheme(Page page);
	
	int deleteMsg(int msgid);
	
	int restoreMsg(int msgid);
	
	int updateMsg(Message message);
	
	Page search(MessageCriteria messageCriteria, Page page);
	
	long queryMsgCountByDate(Date startDate, Date endDate);	// 根据时间查发贴数量
	
	long queryReplyCountByDate(Date startDate, Date endDate);	// 根据时间回贴数量
}
