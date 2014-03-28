/**
 * IUserDao.java
 */
package com.sizheng.afl.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.sizheng.afl.pojo.entity.User;

/**
 * 【用户】持久化接口层.
 * 
 * @creation 2014年03月28日 10:02:03
 * @modification 2014年03月28日 10:02:03
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IUserDao {

	/**
	 * 查询【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月28日 10:02:03
	 * @modification 2014年03月28日 10:02:03
	 * @param locale
	 * @param user
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, User user, Long start, Long limit);

	/**
	 * 查询总数查询【用户】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月28日 10:02:03
	 * @modification 2014年03月28日 10:02:03
	 * @param locale
	 * @param user
	 * @return
	 */
	long queryCount(Locale locale, User user);
	
}
