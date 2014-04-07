/**
 * IBusinessService.java
 */
package com.sizheng.afl.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.sizheng.afl.base.IBaseService;
import com.sizheng.afl.pojo.entity.Business;
import com.sizheng.afl.pojo.entity.BusinessConsumer;
import com.sizheng.afl.pojo.model.WeiXinBaseMsg;
import com.sizheng.afl.pojo.vo.PageResult;

/**
 * 【商家】业务逻辑接口.
 * 
 * @creation 2014年03月25日 02:46:32
 * @modification 2014年03月25日 02:46:32
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IBusinessService extends IBaseService {

	/**
	 * 创建【商家】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	boolean save(Locale locale, Business business);

	/**
	 * 删除【商家】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	boolean delete(Locale locale, Business business);

	/**
	 * 获取【商家】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	Business get(Locale locale, Business business);
	
	/**
	 * 更新【商家】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	boolean update(Locale locale, Business business);
	
	/**
	 * 列举【商家】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	List<Business> list(Locale locale);

	/**
	 * 查询【商家】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Business business);

	/**
	 * 查询【商家】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	PageResult paging(Locale locale, Business business, Long start, Long limit);

	/**
	 * 判断【商家】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 02:46:32
	 * @modification 2014年03月25日 02:46:32
	 * @param business
	 * @return
	 */
	boolean exists(Locale locale, Business business);

	/**
	 * 二维码达到限制.
	 * 
	 * @author xiweicheng
	 * @creation 2014年3月27日 上午11:18:33
	 * @modification 2014年3月27日 上午11:18:33
	 * @param locale
	 * @param openId
	 * @return
	 */
	boolean isQrcodeLimited(Locale locale, String openId);

	/**
	 * 添加食客.
	 * 
	 * @author xiweicheng
	 * @creation 2014年3月27日 上午11:17:52
	 * @modification 2014年3月27日 上午11:17:52
	 * @param locale TODO
	 * @param bean
	 * @return
	 */
	String addConsumer(Locale locale, WeiXinBaseMsg bean);

	/**
	 * 发送动态登录链接到邮箱
	 * 
	 * @author xiweicheng
	 * @creation 2014年3月28日 上午11:09:19
	 * @modification 2014年3月28日 上午11:09:19
	 * @param locale
	 * @param business
	 * @param serverBaseUrl TODO
	 * @return
	 */
	String sendMail(Locale locale, Business business, String serverBaseUrl);

	/**
	 * 生成登录动态二维码.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月3日 下午1:41:31
	 * @modification 2014年4月3日 下午1:41:31
	 * @param locale
	 * @param business
	 * @return
	 */
	String createDynamicCode(Locale locale, Business business);

	/**
	 * 查询消费用户.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月3日 下午5:02:20
	 * @modification 2014年4月3日 下午5:02:20
	 * @param locale
	 * @param business
	 * @param status TODO
	 * @return
	 */
	List<Map<String, Object>> listCustomer(Locale locale, Business business, String status);

	/**
	 * 查询消费体信息.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月6日 下午10:27:22
	 * @modification 2014年4月6日 下午10:27:22
	 * @param locale
	 * @param businessConsumer
	 * @return
	 */
	List<Map<String, Object>> queryGroupInfo(Locale locale, BusinessConsumer businessConsumer);

	/**
	 * 获取用户的消费额.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月6日 下午11:25:43
	 * @modification 2014年4月6日 下午11:25:43
	 * @param locale
	 * @param consumeCode
	 * @return
	 */
	double getConsume(Locale locale, String consumeCode);

	/**
	 * 获取用户体的消费额.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月6日 下午11:25:43
	 * @modification 2014年4月6日 下午11:25:43
	 * @param locale
	 * @param consumeCode
	 * @return
	 */
	double getTotalConsume(Locale locale, String sceneId);

	/**
	 * 获取消费金额.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月7日 上午11:38:51
	 * @modification 2014年4月7日 上午11:38:51
	 * @param locale
	 * @param consumeCode
	 * @param ownOrGroup
	 * @return
	 */
	double getConsume(Locale locale, String consumeCode, String ownOrGroup);

	/**
	 * 结账确认处理.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月7日 下午1:46:36
	 * @modification 2014年4月7日 下午1:46:36
	 * @param locale
	 * @param businessConsumer
	 * @return
	 */
	Boolean checkout(Locale locale, BusinessConsumer businessConsumer);

	/**
	 * 获取集体人数.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月7日 下午3:05:22
	 * @modification 2014年4月7日 下午3:05:22
	 * @param locale
	 * @param consumeCode
	 * @return
	 */
	long getGroupSize(Locale locale, String consumeCode);
}
