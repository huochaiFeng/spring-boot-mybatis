package com.hwadee.smbms.dao;

import org.apache.ibatis.annotations.Param;

import com.hwadee.smbms.model.User;

public interface UserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(@Param("userCode")String userCode)throws Exception;
}
