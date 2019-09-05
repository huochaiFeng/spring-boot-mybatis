package com.hwadee.smbms.service;

import java.util.List;

import com.hwadee.smbms.model.Role;


public interface RoleService {
	
	/**
	 * 获取角色列表
	 * @return
	 * @throws Exception
	 */
	public List<Role> getRoleList() throws Exception;
	
}
