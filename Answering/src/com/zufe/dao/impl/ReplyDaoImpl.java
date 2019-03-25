package com.zufe.dao.impl;

import java.util.Date;
import java.util.Map;

import com.zufe.dao.*;
import com.zufe.model.*;
import com.zufe.util.DBUtil;
import com.zufe.util.Page;

public class ReplyDaoImpl implements IReplyDao {
		private DBUtil dbutil =new DBUtil();
	@Override
	public int replyMsg(Reply reply) {
			String sql="INSERT INTO reply(msgid,userid,replycontents,replyip) VALUES(?,?,?,?)";
			int rs=0;
			try {
				rs=dbutil.execute(sql, new Object[]{reply.getMsgid(),reply.getUserid(),reply.getReplycontents(),reply.getReplyip()});
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return rs;
	}

	@Override
	public Page queryBymsgid(int msgid, Page page) {
		StringBuffer sBuffer=new StringBuffer();
		sBuffer.append(" SELECT replyid,msgid,replycontents,replytime,replyip, ");
		sBuffer.append(" u.userid,u.username,realname,sex,city  ");
		sBuffer.append(" FROM reply r");
		sBuffer.append(" INNER JOIN user u on r.userid=u.userid ");
		sBuffer.append(" WHERE r.msgid=? ");
		sBuffer.append("ORDER BY replytime ");
		Page resPage=null;
		resPage=dbutil.getQueryPage(ReplyInfo.class, sBuffer.toString(), new Object[]{msgid}, page);
		return resPage;
	}

	@Override
	public long queryCountByDate(Date startDate, Date endDate) {
		String sql = "SELECT COUNT(*) AS count FROM reply WHERE replytime > ? AND replytime < ?";
		Object[] params = {startDate, endDate};
		Map map = null;
		try {
			map = dbutil.getObject(sql, params);
			long count = (Long) map.get("count");
			
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
