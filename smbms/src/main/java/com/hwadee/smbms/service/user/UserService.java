package com.hwadee.smbms.service.user;

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
