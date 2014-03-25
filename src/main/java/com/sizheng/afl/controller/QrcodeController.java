/**
 * QrcodeController.java
 */
package com.sizheng.afl.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sizheng.afl.base.BaseController;
import com.sizheng.afl.pojo.model.Qrcode;
import com.sizheng.afl.pojo.vo.PageResult;
import com.sizheng.afl.pojo.vo.ReqBody;
import com.sizheng.afl.pojo.vo.ResultMsg;
import com.sizheng.afl.service.IQrcodeService;

/**
 * 【二维码】请求控制层.
 * 
 * @creation 2014年03月25日 05:57:01
 * @modification 2014年03月25日 05:57:01
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "qrcode")
public class QrcodeController extends BaseController {

	private static Logger logger = Logger.getLogger(QrcodeController.class);

	@Autowired
	IQrcodeService qrcodeService;

	/**
	 * 添加【二维码】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		boolean saved = qrcodeService.save(locale, qrcode);

		// TODO null->ID
		return new ResultMsg(saved, reqBody.getId(), null);
	}

	/**
	 * 删除【二维码】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		boolean deleted = qrcodeService.delete(locale, qrcode);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【二维码】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		Qrcode getQrcode = qrcodeService.get(locale, qrcode);

		return new ResultMsg(true, reqBody.getId(), getQrcode);
	}

	/**
	 * 更新【二维码】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		boolean updated = qrcodeService.update(locale, qrcode);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举【二维码】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("列举【二维码】");

		// TODO

		// Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		List<Qrcode> qrcodeList = qrcodeService.list(locale);

		return new ResultMsg(reqBody.getId(), qrcodeList);
	}

	/**
	 * 查询【二维码】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		// Assert.notNull(qrcode.get);

		List<Map<String, Object>> qrcodeList = qrcodeService.query(locale, qrcode);

		return new ResultMsg(reqBody.getId(), qrcodeList);
	}

	/**
	 * 查询【二维码】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年03月25日 05:57:01
	 * @modification 2014年03月25日 05:57:01
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【二维码】");

		// TODO

		Qrcode qrcode = getParam(reqBody, Qrcode.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// Assert.notNull(qrcode.get);

		PageResult pageResult = qrcodeService.paging(locale, qrcode, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

	@RequestMapping("input")
	public String input(HttpServletRequest request, Locale locale, Model model) {
		return "qrcode/input";
	}

	@RequestMapping("create")
	public String create(HttpServletRequest request, Locale locale, Model model, @ModelAttribute Qrcode qrcode) {

		String realPath = request.getSession().getServletContext().getRealPath("/");
		logger.debug(realPath);

		String imgUrl = qrcodeService.create(qrcode, realPath);

		model.addAttribute("imgUrl", imgUrl);

		return "qrcode/create";
	}

}