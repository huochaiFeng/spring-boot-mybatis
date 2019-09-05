package com.hwadee.smbms.service;

import com.hwadee.smbms.model.User;

public interface UserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public User login(String userCode,String userPassword) throws Exception;
}
