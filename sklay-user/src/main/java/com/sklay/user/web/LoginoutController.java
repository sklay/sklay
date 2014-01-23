/**
 * Project name : slyak-user
 * File name : LoginoutController.java
 * Package name : com.slyak.user.web
 * Date : 2013-11-27
 * Copyright : 2013 , SLYAK.COM All Rights Reserved
 * Author : stormning@163.com
 */
package com.sklay.user.web;

import org.apache.shiro.authc.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sklay.core.mode.DataView;
import com.sklay.user.util.LoginUserHelper;

@Controller
public class LoginoutController {

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(String username, String password, boolean rememberMe) {
		try {
			LoginUserHelper.login(username, password, rememberMe);
		} catch (AuthenticationException ae) {
			// do noting
		}
		return "redirect:/";
	}

	@RequestMapping(value = "/doAjaxLogin", method = RequestMethod.POST)
	@ResponseBody
	public DataView doAjaxLogin(String username, String password,
			boolean rememberMe) {
		DataView result = new DataView();
		try {
			LoginUserHelper.login(username, password, rememberMe);
			result.setCode(1);
			result.setMessage("success");
		} catch (AuthenticationException ae) {
			result.setCode(0);
		}
		return result;
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "alone:core.login";
	}

	@RequestMapping("/logout")
	public String logout() {
		LoginUserHelper.logout();
		return "redirect:/";
	}
}
